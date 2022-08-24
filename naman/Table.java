package naman;

public class Table {

	public static void main(String[] args) {
		
		int c = 7;
		
		switch (c) {
		
		case 2 : 
			for (int i = 2; i <= 20 ; i++) {
				System.out.println(i);
				i = i+1;
			}
			break;
		
		case 3 : 
			for (int i = 3; i <= 30 ; i++) {
				System.out.println(i);
				i = i+2;
			}
			break;
			
		case 4 : 
			for (int i = 4; i <= 40 ; i++) {
				System.out.println(i);
				i = i+3;
			}
			break;
			
		case 5 : 
			for (int i = 5; i <= 50 ; i++) {
				System.out.println(i);
				i = i+4;
			}
			break;
			
			 default : 
				 System.out.println("Error.......!!!");
			}
					
				
		
		
		
	}

}
