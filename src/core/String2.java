package core;

public class String2 extends Object {

	public String2(String name) {
		// System.out.println(name);
	}

	public static void main(String[] args) {

		String s1 = new String("Ravi");

		String s2 = new String("Ajay");

		String s3 = new String("Ravi");

		String s4 = "abc";

		String s5 = "xyz";// contents of the String

		String s6 = "Ravi";

		// equals() method in String

		boolean b = s3.equals(s6);// contents of the string

		System.out.println(b);

		String2 s7 = new String2("Kumar");

		String2 s8 = new String2("Kumar");

		boolean b2 = s7.equals(s8);

		System.out.println(b2);

		// length():it will gives the length of the String

		int size = s4.length();

		System.out.println(size);

		// toCharArray():it will convert the String into characters

		String name = "manikanta";

		char ch[] = name.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i]);

		}

		// converts string into bytes

		byte[] b3 = name.getBytes();

		for (int i = 0; i < b3.length; i++) {
			System.out.println((char) b3[i] + "===========" + b3[i]);
		}

		String toupperCase = name.toUpperCase();

		System.out.println(toupperCase);

		String tolowerCase = toupperCase.toLowerCase();

		System.out.println("lowercase:" + " " + tolowerCase);

		String replace = name.replace('a', 'h');

		System.out.println(replace);

		System.out.println("=============================");

		String n1 = "abc";

		String n2 = "xyz";

		int num = n2.compareTo(n1);

		System.out.println(num);

		System.out.println("=============================");

		String human = "Anil Kumar";// immutable

		String newhuman = human.substring(5);

		System.out.println(newhuman);

		String human3 = human.substring(0, 4);// begin index(included)

		// end index(excluded)

		System.out.println(human3);

		System.out.println("::::::::::::::::::");

		char c = human.charAt(1);

		System.out.println(c);

	}

}
