package abstraction;

public class Circle extends Shape {
	
	private int length;
	private int width;
	public int getLenght() {
		return length;
	}
	public void setLenght(int lenght) {
		this.length = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public void area() {
		int total = length*width;
		 System.out.println(total);
	}
}
