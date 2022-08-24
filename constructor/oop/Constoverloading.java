package constructor.oop;

public class Constoverloading {
	 
	private String name = null;
	private int age = 0;
	private String address = null;
	
	public Constoverloading() {
		
	}
    public Constoverloading(String name, String address) {
	   this.name = name;
	   this.address = address;
	}
	
	public Constoverloading(String n, String ad, int a) {
		name = n;
		address = ad;
		age = a;
		
	}
	
}
