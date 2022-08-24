package Datex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date8 {

	public static void main(String[] args) throws ParseException {
		
		String a = "20/01/2002";
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			Date d = sdf.parse(a);
			int currentDate = calculateAge(d);
			System.out.println(currentDate);
	}

	private static int calculateAge(Date d) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		Calendar c1 = Calendar.getInstance();
		c1.setTime(new Date());
		return c1.get(Calendar.YEAR)-c.get(Calendar.YEAR);
	}

}
