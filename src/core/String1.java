package core;

public class String1 {

	public static void main(String[] args) {

	String s1 = new String("Mani");//userdefine class 

	System.out.println(s1);

	System.out.println(s1.toString());
	
	String s2="Mani";
	
	System.out.println(s2);
	
	//String as immutable?
	
	//what is immutable?
	
	//once the object of the contents stored in the 
	
	//Object that cannot be changed
	
	  String s3=s1.concat("kanta");
	  
	  //concat method will add the data to the object
	  
	  System.out.println("full name:"+s1);//Manikanta
	  
	  System.out.println("ful1 names of s3:"+s3);
	  
	  
	  String s4=s2.concat("kanta");
	    
	  System.out.println("s2"+"  "+s2);
	    
	    
	  System.out.println(s4);
	  
	  
	  
	  
	  
	  
	  
	

	}

}
