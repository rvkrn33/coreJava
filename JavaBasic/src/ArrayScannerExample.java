import java.util.Scanner;

public class ArrayScannerExample {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Please enter size");
		
		String[] s =new String[sc.nextInt()];
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter value for "+i);
			s[i]=sc.next();
		}
		
		for(String ss: s)
			System.out.println("-->"+ss);
	}
}
