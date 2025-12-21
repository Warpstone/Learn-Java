/*
 * Напишите программу которая генерирует 25 случайных чисел значения типа int.
 * Для каждого значения команда if-else сообщает, в каком отношении оно находится с другим случайно сгенерированным числом (больше, меньше, равно)
 */

import java.util.Scanner;

public class Solution_38 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in);
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Итерация " + i);
			
			System.out.println("Введите первое число: ");
			int a = console.nextInt();
			
			System.out.println("Введите второе число: ");
			int b = console.nextInt();
			
			if (a > b) {
				System.out.println(a + " больше " + b);
			} else if (a < b) {
				System.out.println(a + " меньше " + b);
			} else {
				System.out.println(a + " равно " + b);
			}
			
			System.out.println();
		}

	}

}
