/*2. accept 5 integers from the user , display the total , 
the discount given is 10% on the total, calculate the final total and 
display total bill, discount given */
package assignment;

import java.util.Scanner;

public class Assign2{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int c;
		int d,sum=0;
		int e,total=0;
		int bill;
		int disc;
		System.out.println("Enter the 5 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		sum+=a+b+c+d+e;
		disc=(sum/100)*10;
		total=sum-disc;
		System.out.println("Sum="+sum);
		System.out.println("Disc1"+disc);
		System.out.println("Total="+disc+"-"+sum+"="+total);
		
	
	}
	
	
	

}
