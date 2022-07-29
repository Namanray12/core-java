package constructor.oop;

public class Testshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			Shape s1 = new Shape();
			Shape s2 = new Shape("Red",45);
			
			String color = s2.getColor();
			int width = s2.getWidth();
					
					System.out.println(color);
					System.out.println(width);
	}

}
