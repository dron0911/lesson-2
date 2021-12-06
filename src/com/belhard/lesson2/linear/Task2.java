package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = input(sc);
		double rez = result(r);
		System.out.print(rez);
		sc.close();
	}

	public static double input(Scanner sc) {
		double value;
		System.out.println("Enter a real number R type nnn.ddd .");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Error! Enter correct value! ");
		}
		value = sc.nextDouble();
		return value;
	}

	public static double result(double r) {
		return (r * 1000) % 1000 + (int) (r) / 1000.0;
	}

}
