package Datex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date5 {

	public static void main(String[] args) throws ParseException {
	
		String dob = "20/01/2002";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
			Date t = sdf.parse(dob);
		 System.out.println(t);
		
		

	}

}
