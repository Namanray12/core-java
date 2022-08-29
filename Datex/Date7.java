package Datex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date7 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 
	//	Date d = new Date();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		String s = args[0];
		String s1 = args[1];
		
		Date d1 = sdf.parse(s);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d2 = sdf1.parse(s1);
		System.out.println(d2);
		if (d1.getTime() <d2.getTime()) {
			
			System.out.println("formate is correct.......//");
			}
		else{
			System.out.println("Error 404......!!!!!");
			
		}
		
		
		
		
	}

}
