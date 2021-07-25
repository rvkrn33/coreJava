package inheritance.example;

public class Calsi extends Calculator{

	Calsi(){
		System.out.println("Calsi constructor");
	}
	
	public void square(int a) {
		
		super.addition(2, 4);
		System.out.println("Square : "+(a*a)); //4
		
	}
	
	public static void main(String[] args) {
		
		Calsi calsi=new Calsi(); // child
		calsi.square(2);
	}
}

//Calsi constructor
//Square : 4
