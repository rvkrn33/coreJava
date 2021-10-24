package basic;

class Test
{
	public static void message(){
		
		System.out.println("Welcome");
	}

	public static void main(String[] args)
	{
		
		//System.out.println("Your name is :"+args[0]);
		//System.out.println("Next :"+args[1]);
		//message();
		
		for(int i=0; i< args.length; i++){
			
			System.out.println(args[i]);
		}
	}

}