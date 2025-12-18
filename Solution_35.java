/*
 * Пример деления по МОДУЛЮ, когда мы узнаем четное или нечетное число
 */

import java.util.Scanner;

public class Solution_35 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number = console.nextInt();
		int remainder = number % 2;
		
		if (remainder == 0) {
			System.out.println("Четное");
		} else {
			System.out.println("Нечетное");
		}

	}

}
