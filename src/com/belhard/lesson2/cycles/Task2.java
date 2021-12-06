package com.belhard.lesson2.cycles;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, h;
		System.out.print("Enter a: ");
		a = input(sc);
		System.out.print("Enter b: ");
		b = input(sc);
		System.out.print("Enter h: ");
		h = input(sc);
		System.out.println("y= " + function(a, b, h));
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

	public static int function(int a, int b, int h) {
		int y = 0;
		for (int x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = (-1) * x;
			}
		}
		return y;
	}
}
