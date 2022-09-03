package polymorphism;

public class Circle extends Shape1 {
	 	
		 private String color;
		 private String boderwidth;
		public String getColor() {
			return color;
		}
		public String getBoderwidth() {
			return boderwidth;
		}
		public Circle() {
			
		}
		 public Circle(String c, String Bw) {
			  
			 color = c;
			 boderwidth = Bw;
		}
		
 }

