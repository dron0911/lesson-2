package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timeInSec = inputTimeInSec(sc);
		String correctTime = result(timeInSec);
		System.out.println();
		System.out.println(correctTime);
		sc.close();
	}

	public static int inputTimeInSec(Scanner sc) {
		int time;
		System.out.print("Enter count of seconds. ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Error! Enter correct value! ");
		}
		time = sc.nextInt();
		return time;
	}

	public static String result(int sec) {
		int hours = sec / 3600;
		int temp = sec - (hours * 3600);
		int minutes = temp / 60;
		int seconds = temp - (minutes * 60);
		return hours + "h " + minutes + "min " + seconds + "s ";
	}
}
