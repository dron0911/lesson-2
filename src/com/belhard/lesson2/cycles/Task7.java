package com.belhard.lesson2.cycles;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.print("Enter m: ");
		m = input(sc);
		System.out.print("Enter n: ");
		n = input(sc);
		System.out.println();
		result(m, n);
		sc.close();

	}

	public static int input(Scanner sc) {
		int value;
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Error! Enter correct value! ");
		}
		value = sc.nextInt();
		return value;
	}

	public static void result(int m, int n) {
		for (int i = m; i <= n; i++) {
			System.out.print(i + ": ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
