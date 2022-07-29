package naman;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		int rem = 0;
		
		while(n!=0) {
			
			rem = n%10;
			n=n/10;
			System.out.print(rem);
		}
		
	}

}
