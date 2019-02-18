package com.cg.payroll.services;
import java.util.List;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;
public class PayrollServicesImpl implements PayrollServices {

	private AssociateDAO associateDao;
	public PayrollServicesImpl() {
		associateDao=new AssociateDAOImpl();
	}
	public PayrollServicesImpl(AssociateDAO associateDao) {
		super();
		this.associateDao=associateDao;
	}

	@Override
	public int acceptAssociateDetails(String firstName, String LastName, String emailId, String department,
			String designation, String pancard, int YearlyInvestmentUnder80C,int basicSalary,int epf,int companyPf,int accountNumber,String bankName,String ifscCode) {
		Associate associate=new Associate(YearlyInvestmentUnder80C, firstName, LastName, department, designation, pancard, emailId,new Salary(basicSalary, epf, companyPf),
				new BankDetails(accountNumber,bankName,ifscCode));
		associate=associateDao.save(associate);
		return associate.getAssociateId();
	}

	@Override
	public double calculateNetSalary(int associateId) throws AssociateDetailsNotfoundException {
		Associate associate=getAssociateDetails(associateId);
		double slab1=associate.getSalary().getBasicSalary()-(250000+associate.getYearlyInvestmentUnder8oC()+associate.getSalary().getCompanyPf()+associate.getSalary().getEpf());
		double slab2=slab1-500000;
		double slab3=slab2-1000000;
		double NetSalary;
		if(associate.getSalary().getBasicSalary()<=250000)
		{
			NetSalary=associate.getSalary().getBasicSalary();
		}
		else if(associate.getSalary().getBasicSalary()>250000 && associate.getSalary().getBasicSalary()<=500000) {
			NetSalary=associate.getSalary().getBasicSalary()-(slab1*0.1);
		}
		else if(associate.getSalary().getBasicSalary()>500000 && associate.getSalary().getBasicSalary()<=1000000) {
			NetSalary=associate.getSalary().getBasicSalary()-((slab1*0.1)+slab2*0.2);
		}
		else {
			NetSalary=associate.getSalary().getBasicSalary()-((slab1*0.1)+(slab2*0.2)+(slab3*0.3));
		}
		return NetSalary;
	}
	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailsNotfoundException {
		Associate associate=associateDao.findOne(associateId);
		if(associate==null)
			throw new AssociateDetailsNotfoundException("Associate details not found for Id"+associateId);
		return associate;
	}
	public List<Associate> getAllAssociateDetails() {

		return associateDao.findAll();
	}
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department,
			String designation, int pancard, int yearlyInvestmentUnder80C, int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, int ifscCode) {
		return 0;
	}
	public List<Associate> getAllAssociatesDetails() {
		return null;
	}
}
