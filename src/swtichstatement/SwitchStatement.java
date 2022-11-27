package swtichstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Mon";
		switch(day) {
		case"Mon":
			System.out.println("This is the first day of the week");
			break;
		case"Tue":
			System.out.println("This is the second day of the week");
			break;
		case"Wed":
			System.out.println("This is the third day of the week");
			break;
		case"Thu":
			System.out.println("This is the fourth day of the week");
			break;
		case"Fri":
			System.out.println("This is the fifth day of the week");
			break;
		case"Sat":
			System.out.println("This is the sixth day of the week");
			break;
		case"Sun":
			System.out.println("This is the seventh day of the week");
			break;
		default: 
			System.out.println("invalid entry");
		}
	}

}
