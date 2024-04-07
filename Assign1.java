/*1. using the scanner class accept two numbers 
from the user and display the total.*/
package assignment;

import java.util.Scanner;

public class Assign1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter the number ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("TOtal of Two number=" + (a + b));

	}
}