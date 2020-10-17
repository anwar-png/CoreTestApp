package core;

public class Test extends Object {

	Test() {

	}

	public String toString() {

		return "Jigsaw";
	}

	public static void main(String[] args) {

		Test t1 = new Test();

		Test t2 = new Test();

		boolean b = t1.equals(t2);

		System.out.println(b);

		Test t3 = t1;

		boolean b2 = t3.equals(t1);

		System.out.println(b2);

		boolean b3 = t3.equals(t2);

		System.out.println(b3);

	}

}
