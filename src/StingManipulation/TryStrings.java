package StingManipulation;

public class TryStrings {

	public static void main(String[] args) {
		String str1 = "Rockstar";
		String str2 = "rockstar";
		
	//String Length method
		System.out.println(str1.length());
	
	//charatcter at index 
		System.out.println(str1.charAt(5));
	//compare to	
	 System.out.println(str1.compareTo(str2));
	 
	//comparetoIgnore case
	 System.out.println(str1.compareToIgnoreCase("rockstar"));
	 
	 //concat
	 System.out.println(str1.concat("swag"));
	 
	 //contains
	 System.out.println(str1.contains("stra"));
	 
	 //content equals
	 System.out.println(str1.contentEquals("RockStar"));

	 //Content Equals String Buffer method
	 StringBuffer sb = new StringBuffer();
	 sb.append("Rockstar");
	 
	 System.out.println(str1.contentEquals(sb));
	 
	 //endsWith
	 System.out.println(str1.endsWith("r"));
	 
	 //index of ch
	 System.out.println(str1.indexOf("c"));
	 //index of string
	 System.out.println(str1.indexOf("s"));
	 
	// System.out.println(str1.);
	 
	 
	}

}
