package core;

public class MyStringBuffer {

	public static void main(String[] args) {
		
		String s=new String("abc");
		
		StringBuffer sb=new StringBuffer("anil"+" ");
		
		sb.append("kumar");
		
		System.out.println(sb);//mutable
		
		s.concat("def");
		
		System.out.println(s);//immutable
		
		
		 String name1="    abcdef";
		 
		 String removespace=name1.trim();
		 
		 System.out.println(removespace);
		 
		 
		 
		 
		 
		  
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
