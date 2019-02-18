package com.cg.payroll.test;

import com.cg.payroll.services.PayrollServices;

public class PayrollServicesTest {
	private static PayrollServices services;
	/*@BeforeClass
	public static void setUpTestEnv() {
		services=new PayrollServicesImpl();
	}
	@Before
	public void setUpTestData(){
		Associate associate1 = new Associate(101,12000,"Arnab", "Pratihar", "Student","Analyst","abc1234","arnab@gmail.com",new Salary(400000,12000,12000), new BankDetails(100050,"icici bank","icici3456"));
		Associate associate2=new Associate(102,12000,"Debojyoti", "basu", "Student","Analyst","sdf1234","debojyoti@gmail.com",new Salary(400000,12000,12000), new BankDetails(100051,"citi bank","cit123456"));
		PayrollDBUtil.associates.put(associate1.getAssociateId(),associate1);
		PayrollDBUtil.associates.put(associate2.getAssociateId(),associate2);
		PayrollDBUtil.ASSOCIATE_ID_COUNTER=102;
	}
	@Test(expected=AssociateDetailsNotfoundException.class)
	public void testGetAssociateDetailsForInvalidAssociateId() throws AssociateDetailsNotfoundException {
		services.getAssociateDetails(1012);
	}
	@Test
	public void testGetAssociateDetailsForValidAssociateId() throws AssociateDetailsNotfoundException {
		Associate expectedAssociate=new Associate(101,10000,"Debojyoti", "basu", "Student","Analyst","abc1234","debojyoti@gmail.com",new Salary(400000,12000,12000), new BankDetails(100051,"citi bank","cit123456"));
		Associate actualAssociate=services.getAssociateDetails(102);
		Assert.assertEquals(expectedAssociate, actualAssociate);
	}
	@Test
	public void testAcceptAssociateDetailsForValidData() {
		int expectedId=103;
		int actualId=services.acceptAssociateDetails("Debojyoti", "basu","debojyoti@gmail.com", "Student","Analyst", "abc1234", 10000, 400000,12000,12000,100051,"citi bank","cit123456");
	}
	@Test(expected=AssociateDetailsNotfoundException.class)
	public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailsNotfoundException {
		services.calculateNetSalary(1023);
	}
	@Test
	public void testCalculateNetSalaryForValidAssociateId() throws AssociateDetailsNotfoundException {
		double expectedNetSalary=0;
		double actualNetSalary=services.calculateNetSalary(102);
		Assert.assertEquals(expectedNetSalary, actualNetSalary);
	}
	@Test
	public void testGetAllAssociateDetails() {
		Associate associate1 = new Associate(101,10000,"biki", "basu", "Student","Analyst","abc1234","biki@gmail.com",new Salary(400000,12000,12000), new BankDetails(100050,"citi bank","cit123456"));
		Associate associate2=new Associate(102,10000,"Debojyoti", "basu", "Student","Analyst","abc1234","debojyoti@gmail.com",new Salary(400000,12000,12000), new BankDetails(100051,"citi bank","cit123456"));
		ArrayList<Associate> expectedAssociateList=new ArrayList<>();
		expectedAssociateList.add(associate1);
		expectedAssociateList.add(associate2);
	}

	@After
	public void tearDownTestDate() {
		PayrollDBUtil.associates.clear();
		PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
	}
	@AfterClass
	public static void tearDownTestEnv() {
		services=null;
	}*/
}