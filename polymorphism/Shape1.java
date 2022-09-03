package polymorphism;

public class Shape1 {
	private String color;
	private String boderwidth;
	
	public String getColor() {
		return color;
	}
	public String getBoderwidth() {
		return boderwidth;
	}
	public Shape1() {
		
	}
	public Shape1(String c, String b) {
		color = c;
		boderwidth = b;
	
	}
	public  double area() {
		return 0;
		
	}
}
