package com.belhard.lesson2.cycles;

public class Task3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("����� ��������� ����� �� 1 �� 100 ����� " + sum);
		System.out.println("����� ��������� ����� �� 1 �� 100 ����� " + 100 * (100 + 1) * (2 * 100 + 1) / 6);
	}

}
