package rays.encapsulation;

public class TestDrive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodDog one = new GoodDog();
		one.setSize(70);
		
		GoodDog two = new GoodDog();
		two.setSize(8);
		
		System.out.println("dog one:"+ one.getSize());
		one.bark();
		System.out.println("dog two:"+ two.getSize());
		
		
		two.bark();
	}

}
