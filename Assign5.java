/*accept the number from the user, using the switch case do the following
if the choice is 1	: display  it is holiday
if 2-6	: display it is a working day
if 7 : display it is a funday*/
package assignment;

import java.util.Scanner;

public class Assign5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		System.out.println();
		switch(ch) {
		case 1:
			System.out.println("It is Holiday");
			break;
		case 2:
			System.out.println("It is Working Day");
			break;
		case 3:
			System.out.println("It is Working Day");
			break;
		case 4:
			System.out.println("It is Working Day");
			break;
		case 5:
			System.out.println("It is Working Day");
			break;
		case 6:
			System.out.println("It is Working Day");
			break;
		case 7:
			System.out.println("It is Fun-Day");
			break;
			default:
			System.out.println("Invalid Choice");	
		}
		
		
	}

}
