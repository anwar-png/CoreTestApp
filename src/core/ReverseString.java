package core;

public class ReverseString {

	public static void main(String[] args) {

		String s1 = "mani";

		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {

			s2 = s2 + s1.charAt(i);
			// System.out.println(s2);

		}

		System.out.println(s2);
		
		String s3="";
		
		String s4="abc";
		
		s3=s4.charAt(1)+s3;
		
		System.out.println(s3);
		
		
		
		
		
		
		

	}

}
