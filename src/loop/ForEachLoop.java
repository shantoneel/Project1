package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {4,5,2,1};
	/*	System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]); 
		
		for (int i=0;i<4;i++) {
			System.out.println();
		}*/
		
		for (int a: array) {
			System.out.println(a);
		}
		
		String[] names= {"Jack","Mili","Julie", "Sasha"};
		for (String name : names) {
			System.out.println(name);
			if (name.length()==4){
				
				break;
			}
		}
	}

}
