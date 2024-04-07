/*write a program to display your name , address, mobile number directly*/
package assignment;

import java.util.Scanner;

public class Assign4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		String address;
		long  mobNo;
		name=sc.next();
		address=sc.next();
		mobNo=sc.nextLong();
		System.out.println("Name :"+name+"\nAddress :"+address+"\nMobileNo :"+mobNo);
		
		
		
	}

}
