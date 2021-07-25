package oops.exmple;

public class Bank {

	String[] roles= {"Manager","Cleark"};
	int acNo=123456789;
	int  balance;
	
	String aprLoanstatus="not approved";
	
	Bank(int balance){
		this.balance=balance;
	}
	
	public Bank drCrAmount(int accountNo, int amount, String type, String role, Bank b) {
		
		if(role.equals(roles[1])) {
			if(accountNo==acNo) {
				
				if(type.equals("CR"))
					b.balance=b.balance+amount;
				
				if(type.equals("DR"))
					b.balance=b.balance-amount;
			}else {
				System.out.println("Account not valid");
			}
		}
		else {
			System.out.println("invalid role");
		}
		
		if("Manager".equals(roles[1])) {
			System.out.println("Loan not approved");
		}
		return b;
		
	}
	
}
