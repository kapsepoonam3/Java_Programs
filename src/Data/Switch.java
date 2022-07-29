package Data;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Scanner day =new Scanner(System.in);
			
			Scanner day =new Scanner(System.in);
			System.out.println("Enter First two alphabets of day in week: ");
			String s= day.nextLine();
			day.close();
			
			switch(s) {
			case "MO":System.out.println("Today is Monday");
					break;
			case "TU":System.out.println("Today is Tuesday");
					break;
			case "WE":System.out.println("Today is Wednesday");
					break;
			case "TH":System.out.println("Today is Thursday");
					break;
			case "FR":System.out.println("Today is Friday");
					break;
			case "SA":System.out.println("Today is Saturday");
					break;
			default:System.out.println("Today is Sunday");
			}
			//day.close();	
}

	}

