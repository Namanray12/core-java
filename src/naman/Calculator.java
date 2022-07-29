package naman;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1 = 10;
		int Num2 = 20;
		int result;
		String sym = "*" ;
		
		switch (sym) {
		
		case "+" : result = Num1 + Num2;
				System.out.println(result);
			break;		
				
		case "-" : result = Num1 - Num2;
		System.out.println(result);
			break;
		
		case "/" : result = Num1 / Num2;
		System.out.println(result);
			break;	
		
		case "*" : result = Num1 * Num2;
		System.out.println(result);
			break;
		
		default : System.out.println("invalid symbol");
		
		}
	}

}
