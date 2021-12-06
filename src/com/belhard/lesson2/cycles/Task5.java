package com.belhard.lesson2.cycles;

import java.math.BigInteger;

public class Task5 {
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(1);
		for (int i = 2; i <= 200; i++) {
			a = a.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println(a);
	}
}
