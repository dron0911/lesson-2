package com.belhard.lesson2.linear;

public class Task6 {
	public static void main(String[] args) {
		int x = 0;
		int y = -1;
		System.out.println(result(x, y));
	}

	public static boolean result(int x, int y) {
		if ((x >= -4 & x <= 4 & y >= -3 & y <= 0) || (x >= -2 & x <= 2 & y <= 4 & y > 0)) {
			return true;
		} else {
			return false;
		}
	}

}
