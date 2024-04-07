/* create a class Numbers with 3 private variables,  numOne,  numTwo, result. 
create a function accpetNumbers() to accept 2 numbers from the user. calculateTotal() method will calculate the total in result variable. displayTotal()
method will display the result. 
call these functions inside main method of the class  NumbersTest*/

package assignment;
import java.util.Scanner;

public class Assign3 {
	Scanner sc=new Scanner(System.in);
	private int numOne;
	private int numTwo;
	private int result;
	
	public void acceptNumber() {
		System.out.println("Enter numone,numtwo,result");
		numOne=sc.nextInt();
		numTwo=sc.nextInt();
		
		
	}
	public void total() {
		result=(numOne+numTwo)/2;
		System.out.println("result="+result);
	}
	
}
