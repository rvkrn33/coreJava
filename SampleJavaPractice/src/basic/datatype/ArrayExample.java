package basic.datatype;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] i= {55,44,32,14,78};
		
		int[] arr= new int[4];
		
		for (int k : i) {
			System.out.println("--> "+k);
		}
		
		for (int j = 0; j < arr.length; j++) {
			arr[j]=j+2;
		}
		
		for (int k : arr) {
			System.out.println("--> "+k);
		}
		
		int[][] st= {
				{55,44,32},
				{5,2,88},
				{50,20,8}
				};
		
		int[][] ar= new int[4][2];
		
		for (int j = 0; j < st.length; j++) {
			
			for (int j2 = 0; j2 < st.length; j2++) {
				System.out.println(">>>> "+st[j][j2]);
			}
		}
	}

}
