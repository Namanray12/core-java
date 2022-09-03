package polymorphism;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Shape1[] s = new Shape1[2];
		s[0] = new Circle("green", "23");
		s[1] = new Reactangle(20, 10);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
	
		}
		
	}

}
