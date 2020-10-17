package core;

class Parent extends Object

{

	Parent()

	{

		this("Anoop");

		System.out.println("parent class default constructor");

	}

	Parent(String name)

	{

		System.out.println("parameterized parent constructor:" + name);

	}

	void m1()

	{

		System.out.println("parent class m1 method executed");

	}

}// closed the parent class

class Child extends Parent

{

	final int i = 10;

	Child() {

		super();// default statement includes at compile time

		System.out.println("child class constructor");

	}

	void m1()

	{

		System.out.println("child class m1 method executed");
		super.m1();

	}

	public static void main(String[] args) {

		Child ch = new Child();

		ch.m1();

		System.out.println(ch.i);

		System.out.println(ch.i);

	}

}
