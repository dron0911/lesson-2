package com.belhard.lesson2.branching;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Enter angle a: ");
		a = input(sc);
		System.out.print("Enter angle b: ");
		b = input(sc);
		result(a, b);
		sc.close();
	}

	public static int input(Scanner sc) {
		int value;
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Error! Enter correct value of angle! ");
		}
		value = sc.nextInt();
		return value;
	}

	public static void result(int a, int b) {
		if (a + b >= 180) {
			System.out.println("There is no such triangle");
		} else {
			System.out.println("Triangle is exists");
			if (a == 90 || b == 90 || (180 - a - b) == 90) {
				System.out.println("Right triangle");
			} else {
				System.out.println("Triangle is not right");
			}
		}

	}
}
