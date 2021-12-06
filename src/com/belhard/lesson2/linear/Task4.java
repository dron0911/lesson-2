package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		String result;
		System.out.print("Enter a: ");
		a = input(sc);
		System.out.print("Enter b: ");
		b = input(sc);
		System.out.print("Enter c: ");
		c = input(sc);
		result = function(a, b, c);
		System.out.println(result);
		sc.close();
	}

	public static double input(Scanner sc) {
		double value;
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter correct number!!! ");
		}
		value = sc.nextDouble();
		return value;
	}

	public static String function(double a, double b, double c) {

		double temp = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		if (temp < 0 && a == 0) {
			return "Error! 'a' shouldn't be equal 0 and root value shoudn't be negative";
		} else {
			double rez = ((b + temp) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			return "result = " + rez;
		}
	}

}
