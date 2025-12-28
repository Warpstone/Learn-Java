/*
	Программа спрашивает у пользователя число n;
	Создает массив из n чисел;
	Просит вывести n чисел;
	Запоминает их;
	Выводит все введенные числа;
 */
import java.util.Scanner;

public class Solution_45 {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int n = console.nextInt();

		int[] a = new int[n];                                   // Создает массив целых чисел, длиной n;

		for (int i = 0; i < n; i++) {                           // Цикл для заполнение массива n раз;
			a[i] = console.nextInt();                           // Запоминает данные;
		}

		console.close();                                        // Закрывает Scanner. Больше вывод не нужен;

		for (int i = 0; i < a.length; i++) {                    // Цикл для выполнения массива;
			System.out.println(a[i]);                           // a.lenght - сколько элементов в массиве;
		}
	}
}

