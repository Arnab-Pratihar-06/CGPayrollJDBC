package com.cg.payroll.services;
import java.util.List;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;
public interface PayrollServices {
	double calculateNetSalary(int associateId)throws AssociateDetailsNotfoundException;
	
	
	Associate getAssociateDetails(int associateId)throws AssociateDetailsNotfoundException;
	int acceptAssociateDetails(String firstName, String LastName, String emailId, String department, String designation,
			String pancard, int yearlyInvestmentUnder8oC, int basicSalary, int epf, int companyName, int accountNumber,
			String bankName, String ifscCode);
	List<Associate> getAllAssociateDetails();

	
}