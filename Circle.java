package assignment;

import java.util.Scanner;

public class Circle {
	Scanner sc=new Scanner(System.in);
	float radius;
	double result;
	final double pi=3.14;
	public void accept() {
		System.out.println("Enter the radius");
		radius=sc.nextFloat();
	}
	public void calculateArea() {
		result=pi*radius*radius;
		
	}
	public void displayArea() {
		System.out.println("Area of Circle is ="+result);
	}
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.accept();
		circle.calculateArea();
		circle.displayArea();
		
		
	}

}
