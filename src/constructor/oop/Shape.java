package constructor.oop;

public class Shape {
	
		private String color;
		private int width;
		
		public Shape() {
			                              //Default constructor
		  }
		
		public Shape(String c, int w) {
			                              // parameterized constructor 
			color = c;
		    width = w;
		  }
		
		public String getColor() {
			return color;
		  }
		
		public int getWidth() {
			return width;
		  }
}
