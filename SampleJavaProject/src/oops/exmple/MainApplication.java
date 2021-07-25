package oops.exmple;

public class MainApplication {

	
	public static void main(String[] args) {
		
		Customer c; //reference ---> stack
		
		c=new Customer(); //heap (hashCode()) Memory allocation
		
		System.out.println(c.hashCode());
		
		c.setId(12); 
		c.setName("ravi");
		
		System.out.println(c.getId()+"  "+c.getName());
		
	}
}
