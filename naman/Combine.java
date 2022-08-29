package naman;

import java.util.Scanner;

public class Combine {
     	
		public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the series:");
			
			String series = sc.nextLine();
			
		System.out.println("series :"+ series);	
			switch (series) {
			case "fibo":
				 int a = 0;
				 int b= 1;
				 int c;
				 System.out.println("The Fibonacci series is : ");
				 for (int i = 0; i < 10; i++) {
					 
					 c = a+b;
					 System.out.println(" "+a);
					 a = b;
					 b = c;
				 }
				break;
				
			case "harmo":
				int num = 5 ;
				double result = 0.0;
				
				
				for(int i= num; i > 0; i-- ) {
					
					result = result + (double) 1/i;
					System.out.println(result + " ");
				}		
					
				break;	
			default: System.out.println("error !!!");
				break;
			}
			
		}
}
