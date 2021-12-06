package com.belhard.lesson2.branching;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, result;
		System.out.print("Enter a: ");
		a = input(sc);
		System.out.print("Enter b: ");
		b = input(sc);
		System.out.print("Enter c: ");
		c = input(sc);
		System.out.print("Enter d: ");
		d = input(sc);
		result = maxValue(a, b, c, d);
		System.out.println("max(min(a,b); min(c,d)) = " + result);
		sc.close();

	}

	public static int input(Scanner sc) {
		int value;
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Error! Enter correct number! ");
		}
		value = sc.nextInt();
		return value;
	}

	public static int maxValue(int a, int b, int c, int d) {
		int min1, min2, max;
		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		if (min1 < min2) {
			max = min2;
		} else {
			max = min1;
		}
		return max;
	}

}
