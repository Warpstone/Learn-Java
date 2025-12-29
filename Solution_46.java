/*
	Поиск значения. Что делает этот код?
	Есть список чисел. Есть ли среди них 9? Нужно ответить Да или Нет.
 */

public class Solution_46 {
	static void main() {

		int [] number = {3,6,9,12};                                 // Массив чисел;
		int target = 9;                                             // Число которое ищем;
		boolean found = false;                                      // Флаг - Да или Нет; Заранее считаем, что не нашли;

		for (int i = 0; i < number.length; i++) {                   // Цикл идет по индексам массива, не по значениям;
			if (number[i] == target) {
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Найдено");
		} else {
			System.out.println("Не найдено");
		}
	}
}
