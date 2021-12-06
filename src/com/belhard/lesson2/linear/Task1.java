package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double result;
		System.out.print("Enter a: ");
		a = inputFromConsole(sc);
		System.out.print("Enter b: ");
		b = inputFromConsole(sc);
		System.out.print("Enter c: ");
		c = inputFromConsole(sc);
		result = function(a, b, c);
		System.out.println("z= " + result);
		sc.close();
	}

	public static int inputFromConsole(Scanner sc) {
		int value;
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Error! Enter correct value! ");
		}
		value = sc.nextInt();
		return value;
	}

	public static double function(int a, int b, int c) {
		return (((a - 3) * b / 2.0) + c);
	}

}
