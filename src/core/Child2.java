package core;

class Parent2
{

	void m1()
	{
		System.out.println("parent2 m1()");
	}
	
}
public class Child2 extends Parent2 {
	
	void m2()
	{
		System.out.println("child2 m2()");
	}

	public static void main(String[] args) {
	
		//upper casting compilor will take care
		Parent2 p2=new Child2();//child is smaller object than parent
		
		 p2.m1();
		 
		 //p2.m2();
		 
	  Child2 ch2=(Child2)p2;//downcasting
	  
	   ch2.m2();
	   
	   
	   Object obj=new Parent2();
	   
	   String address=obj.toString();
	   
	   System.out.println(address);
	   
	   //downcasting
	   
	   Parent2 p=(Parent2)obj;
	   
	   p.m1();
	   
	   Child2 ch=(Child2)p;
	   
	   ch.m1();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	  
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
