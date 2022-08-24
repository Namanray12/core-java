package Array;

public class Arr4reverse {

	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			for (int j = s.length()-1; j >=0; j--) {
				System.out.println(s.charAt(j)+"  ");
			}
		}

	}

}
