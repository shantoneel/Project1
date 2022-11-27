package variables;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare and assign an array
		int [] array = {4, 5, 2, 1};
		System.out.println(array.length);

		//different way
		//declare array
		int [] array2 = new int [5];
		//assign
		array2[0]=1;
		array2[1]=2;
		array2[2]=3;
		array2[3]=4;
		array2[4]=5;
		
		System.out.println(array2);
		
		for (int i = 4; i>=0; i--) {
			System.out.println(array2[i]);
			
			String s = "hklhlkhas";
			System.out.println(s.toUpperCase());  
			System.out.println(s.charAt(6));
			
			
		}
	}

}
