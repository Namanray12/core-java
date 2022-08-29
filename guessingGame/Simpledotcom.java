package guessingGame;

public class Simpledotcom {
	 int [] locationCells;
	 int numofHits = 0;
	 
	 public void setlocationCells(int []locs) {
		 locationCells = locs;
	 }
	 		public String checkYourself(String  stringGuess) {
	 			int guess = Integer.parseInt(stringGuess);
	 			String result = "miss";
				
	 			for (int cell : locationCells) {
					
					if (guess == cell) {
						
						result = "Hit";
						numofHits++;
						
						break;
					}
				}
	 			
	 			if (numofHits ==locationCells.length) {
					
	 				result = "kill";
				}
	 			System.out.println(result);
	 			return result;
	 		}
}
