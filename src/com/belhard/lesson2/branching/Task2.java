package com.belhard.lesson2.branching;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = input(sc);
		System.out.println("F(x)= " + function(x));
		sc.close();
	}

	public static int input(Scanner sc) {
		int value;
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Enter correct number!!! ");
		}
		value = sc.nextInt();
		return value;
	}

	public static double function(int x) {
		double f;
		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		return f;
	}

}
