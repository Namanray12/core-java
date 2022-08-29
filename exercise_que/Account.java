package exercise_que;

public class Account {
		
	private double balance;
	private double withdrawl;
	private String AccountType;
	private String phoneno;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	public String getAccountType() {
		return AccountType;
	} 
	public void setAccountType(String accountno) {
		AccountType = accountno;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public void TransferAmount(double TA) {
	         double TA1 = balance - TA;
	         balance = TA1;
	         System.out.println("Current balance after T.A:"+TA1 );;
	}
	public void payBill(double PB) {
			double PB1 =  balance-PB;
			balance = PB1;
			System.out.println("Current balance after P.B:"+PB1);
	}
    public void deposit() {
		
	}
}
