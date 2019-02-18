package com.cg.payroll.test;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class PayrollServicesTestEasyMock {
	private static PayrollServices payrollServices;
	private static AssociateDAO mockAssociateDAO;

	@BeforeClass
	public static void setUpTestEnv() {
		mockAssociateDAO=EasyMock.mock(AssociateDAO.class);
		payrollServices=new PayrollServicesImpl(mockAssociateDAO);
	}
	@Before
	public void setUpTestMockData() {
		Associate associate1 = new Associate(101,10000,"Arnab", "Pratihar", "Student","Analyst","abc1234","arnab@gmail.com",new Salary(400000,12000,12000), new BankDetails(100050,"icici bank","icici"+"23456"));
		Associate associate2=new Associate(102,10000,"Debojyoti", "basu", "Student","Analyst","sdf1234","debojyoti@gmail.com",new Salary(400000,12000,12000), new BankDetails(100051,"citi bank","cit123456"));
		Associate associate3=new Associate(652,20000,"bojyoti", "basu", "Student","Analyst","abc1234","debojyoti@gmail.com",new Salary(400000,12000,12000), new BankDetails(100051,"citi bank","cit123456"));
		
		ArrayList<Associate>associatesList=new ArrayList<Associate>();
		associatesList.add(associate1);
		associatesList.add(associate2);
		EasyMock.expect(mockAssociateDAO.save(associate3)).andReturn(associate3);

		EasyMock.expect(mockAssociateDAO.findOne(101)).andReturn(associate1);
		EasyMock.expect(mockAssociateDAO.findOne(102)).andReturn(associate2);
		EasyMock.expect(mockAssociateDAO.findOne(1234)).andReturn(null);
		EasyMock.expect(mockAssociateDAO.findAll()).andReturn(associatesList);
		EasyMock.replay(mockAssociateDAO);
	}

	@Test(expected=AssociateDetailsNotfoundException.class)
	public void testGetAssociateDataForInvalidAssociateId()throws AssociateDetailsNotfoundException{
		//Associate actualValue=payrollServices.getAssociateDetails(1234);
		payrollServices.getAssociateDetails(1234);
		EasyMock.verify(mockAssociateDAO.findOne(1234));
		//assertEquals(actualValue, 12345);
	}
	
	@Test
	public void testGetAssociateDetailsForValidAssociateId()throws AssociateDetailsNotfoundException{
		Associate expectedAssociate=new Associate(101,10000,"Arnab", "Pratihar", "Student","Analyst","abc1234","arnab@gmail.com",new Salary(400000,12000,12000), new BankDetails(100050,"icici bank","icici"));
		Associate actualAssociate=payrollServices.getAssociateDetails(101);
		Assert.assertEquals(expectedAssociate,actualAssociate);
		//EasyMock.verify(mockAssociateDAO.findOne(101));
	}
	@After
	public void tearDownTestMockData() {
		EasyMock.resetToDefault(mockAssociateDAO.findOne(101));
	}
	
	@AfterClass
	public static void tearDownTestEnv() {
		mockAssociateDAO=null;
		payrollServices=null;
	}
}
