package guessingGame;

import java.util.Scanner;

public class SimpleDotComTestDrive {

		public static void main(String[] args) {
			System.out.println("...!!!WELCOME TO THE GUESSING GAME...!!!!");
			System.out.println("If you choose right number you will be **Pass** ");
			System.out.println("Enter any Number between 0 to 10");
			
			Simpledotcom sd = new Simpledotcom();
			
			Scanner sc = new Scanner(System.in);	
			
		System.out.println("Enter the number : ");
		
		int [] locations = {2,3,4};
			
			sd.setlocationCells(locations);
			
			String userGuess = sc.nextLine();
			System.out.println("The Number is : " + userGuess );
			
			String result = sd.checkYourself(userGuess);
			
	
			
			if ( result.equals("Hit")  ) {
				System.out.println("****Congratulations you Passed****");
			}
			else if (result.equals("miss")) {
				System.out.println("Better luck next time..!!!!");
			}
			else if (result.equals("Kill")) {
				System.out.println("Better luck next time..!!!!");
			}
			
		}
}
