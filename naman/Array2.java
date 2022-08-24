package naman;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
			
			int [][] Studentmarks = new int[3][3];
					
		Studentmarks [0][0] = 90;
		Studentmarks [0][1] = 70;
		Studentmarks [0][2] = 80;

			
		Studentmarks [1][0] = 90;
		Studentmarks [1][1] = 70;
		Studentmarks [1][2] = 60;

		
		Studentmarks [2][0] = 90;
		Studentmarks [2][1] = 70;
		Studentmarks [2][2] = 40;
		
		System.out.println  (Arrays.deepToString(Studentmarks));
	}

}
