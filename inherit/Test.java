package inherit;

public class Test {

	public static void main(String[] args) {
		
		Reactangle r = new Reactangle();
		 
		r.setBorder(10);
		r.setColor("red");
		
		r.setLenght(90);
		r.setWidth(80);
		
		System.out.println(r.getBorder());
		System.out.println(r.getColor());
		System.out.println(r.getLenght());
	}
}
