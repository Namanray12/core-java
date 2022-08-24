package Datex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String s = sdf.format(d);
		
		sdf.parse(s);
		
		Date m = new Date();
		
		System.out.println(s);
		
		System.out.println(m);
		
		
		
	}

}
