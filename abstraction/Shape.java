package abstraction;

public abstract class Shape {

	private int age;
	private String Address;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public abstract void area();
	
}
