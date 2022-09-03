package polymorphism;

public class Reactangle extends Shape1 {

	private int lenght;
	private int boderwidth;
	
	public int getLenght() {
		return lenght;
	}
	public int getWidthboder() {
		return boderwidth;
	}
	public Reactangle() {
		
		}

	public Reactangle(int l, int w) {
		lenght = l;
		boderwidth  = w;
		}
	public double area() {
		int total = lenght*boderwidth;
		 System.out.println(total);
		 return 0;
	}

	}

