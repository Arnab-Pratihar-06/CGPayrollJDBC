package com.cg.payroll.beans;

public class Associate {
	private int associateId;
	private int YearlyInvestmentUnder8oC;
	private String firstName, lastName,department,designation,pancard,emailId;
	private Salary salary;
	private BankDetails bankDetails;
	
	public Associate(int associateId, int YearlyInvestmentUnder8oC, String firstName, String lastName,
			String department, String designation, String pancard, String emailId) {
		super();
		this.associateId = associateId;
		this.YearlyInvestmentUnder8oC = YearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
	}
	
	public Associate(int YearlyInvestmentUnder8oC, String firstName, String lastName, String department,
			String designation, String pancard, String emailId, Salary salary, BankDetails bankDetails) {
		super();
		this.YearlyInvestmentUnder8oC = YearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.salary = salary;
		this.bankDetails = bankDetails;
	}
	
	public Associate(int associateId, int yearlyInvestmentUnder8oC, String firstName, String lastName,
			String department, String designation, String pancard, String emailId, Salary salary,
			BankDetails bankDetails) {
		super();
		this.associateId = associateId;
		YearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.salary = salary;
		this.bankDetails = bankDetails;
	}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getYearlyInvestmentUnder8oC() {
		return YearlyInvestmentUnder8oC;
	}
	public void setYearlyInvestmentUnder8oC(int YearlyInvestmentUnder8oC) {
		this.YearlyInvestmentUnder8oC = YearlyInvestmentUnder8oC;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", yearlyInvestmentUnder8oC=" + YearlyInvestmentUnder8oC
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + ", pancard=" + pancard + ", emailId=" + emailId + ", salary="
				+ salary + ", bankDetails=" + bankDetails + "]";
	}
}