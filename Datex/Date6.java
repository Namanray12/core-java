package Datex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Date6 {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		Calendar cal = Calendar.getInstance();
		 
		cal.setTime(d);
		 
		for(int i = 1; i < 12; i++) {
			
			cal.add(Calendar.DATE, 20);
			
			Date c = cal.getTime(); 
			String s = sdf.format(c);
			
			System.out.println(s);
			
		}
		
	}

}
