/* accept a number and display the power 
  eg if number accepted is 24 then display the result as 2 raise to 4*/
package assignment;

import java.util.Scanner;

public class Assign8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		System.out.println(Math.pow(num,num));
		
	}
		 
	}