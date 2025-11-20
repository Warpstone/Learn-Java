/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
Требования:
• Программа должна считывать данные c клавиатуры.
• Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
• В программе необходимо использовать цикл while.
 */

import java.util.Scanner;

public class Solution_17 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);          // Создаём единственный оператор ввода
		int sum = 0; 										// Аккумулятор для суммы, где будет считаться сумма вводов чисел
		boolean text = false;  								// Флаг для цикла. Цикл будет работать до тех пор пока условие false
		while (!text) {
			if (console.hasNextInt()) {
				int number = console.nextInt();
				sum = sum + number;
			} else if (console.hasNextLine()) {
				String line = console.nextLine();
				if (line.equals("ENTER")) {
					text = true;			
				}
			}
		}
		System.out.println(sum);
	}

}
