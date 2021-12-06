package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("Enter a in degrees: ");
		x = input(sc);
		System.out.println("Enter b in degrees: ");
		y = input(sc);
		System.out.println(result(x, y));
		sc.close();
	}

	public static double input(Scanner sc) {
		double degrees;
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter correct number!!! ");
		}
		degrees = sc.nextDouble();

		double radian = degrees * Math.PI / 180.0;
		return radian;
	}

	public static String result(double x, double y) {
		double temp = Math.cos(x) - Math.sin(y);
		System.out.println(temp);
		if (temp == 0) {
			return "Error! Denominator shouldn't be equal 0";
		} else {
			return "result= " + (Math.sin(x) + Math.cos(y)) / temp * Math.tan(x * y);
		}
	}

}
