package naman;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		 //outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<= i; j++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

}
 