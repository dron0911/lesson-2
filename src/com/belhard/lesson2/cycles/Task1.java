package com.belhard.lesson2.cycles;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = input(sc);
		System.out.println("Sum numbers from 1 to x is equal : " + sumNumbers(x));
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

	public static int sumNumbers(int x) {
		int sum = 0;
		if (x > 0) {
			for (int i = 1; i <= x; i++) {
				sum += i;
			}
			return sum;
		} else {
			for (int i = 1; i >= x; i--) {
				sum += i;
			}
			return sum;
		}
	}

}
