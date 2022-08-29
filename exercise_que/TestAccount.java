package exercise_que;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Account ac = new Account();
		ac.setAccountType("Saving acc..");
		ac.setBalance(70894);
		ac.setPhoneno("9691950453");
		ac.setWithdrawl(4000);
		ac.TransferAmount(400);
		ac.payBill(300);
		System.out.println(ac.getAccountType());
		 System.out.println(ac.getBalance());
		  System.out.println(ac.getPhoneno());
		   System.out.println(ac.getWithdrawl());
		
		
	}

}
