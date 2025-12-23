/*
 * Написать программу которая выводит 10 строк и выводит на экран сколько из этих строк было чисел.
 */
import java.util.Scanner;
public class Solution_33 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);		// Создаем объект Scanner для чтения данных из консоли.
		int count = 0;									// В этой переменной будет хранить кол-во чисел.
		for(int i = 0; i < 10; i++) {					// Цикл от 0 до 10 (не включая 10).
			if (console.hasNextInt())					// Если в консоль ввели число,
				count++;								// то увеличиваем на единицу.
			console.nextLine();							// Считываем строку из консоли и никуда ее не сохраняем.
		}
		System.out.println(count);
	}

}
