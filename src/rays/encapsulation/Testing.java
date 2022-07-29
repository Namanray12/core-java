package rays.encapsulation;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Setget sg = new Setget();
		
		sg.setfname("Naman");
		sg.setlname("Kanungo");
		sg.setid(12134);
		
		String fname = sg.getfname();
		System.out.println(fname);
		
		String lname = sg.getlname();
		System.out.println(lname);
		
		System.out.println(sg.getid());
	}
 
}
