// Программа выводит на экран числа с 1 по 20. Если число делится на 7 (остаток от деления на 7 равен 0), вывод на экран пропускается.

public class Solution_21 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 20) {
			if ((i % 7) == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
