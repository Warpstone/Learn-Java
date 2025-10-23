// Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
// Для этого тебе нужно: 
// 1. Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
// 2. Определить возможность существования треугольника по сторонам.
// Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.

import java.util.Scanner;

public class Solution_1 {
	private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		
		if (number1 < number2 + number3 && number2 < number1 + number3 && number3 < number1 + number2) {
			System.out.println(TRIANGLE_EXISTS);
		} else {
			System.out.println(TRIANGLE_NOT_EXISTS);
		}
	}

}
