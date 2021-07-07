package com.basic.abstraction;

public class Bank {

private String accountNo;
	
	private String enquiry;
	
	private String operation;
	private int amt;
	
	private String approveLoanAmt;
	private String role;
	
	
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(String enquiry) {
		this.enquiry = enquiry;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getApproveLoanAmt() {
		return approveLoanAmt;
	}

	public void setApproveLoanAmt(String approveLoanAmt) {
		this.approveLoanAmt = approveLoanAmt;
	}

	public void transaction(String accountNo1, String role, String operation) {
		accountNo="123456";
		
		if(role.equals("manager")) {
			approveLoanAmt="200000";
			System.out.println("Approve loan");
		}
		
		if(role.equals("cleark")) {
			if(accountNo.equals(accountNo1)) {
				amt=5000;
			}
			System.out.println("Your balance is :"+amt);
		}
		
		
		if(role.equals("cashier")) {
			if(accountNo.equals(accountNo1)) {
				if(operation.equals("W")) 
					System.out.println("successfull withdrwal Amt");
				else
					System.out.println("successfull creating Amt");
			}
			System.out.println("Transaction Successfull");
		}
		
		
	}
	
}
