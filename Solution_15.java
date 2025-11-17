/*
Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Требования:
Программа должна считывать имя c клавиатуры.
Программа должна выводить текст на экран.
Программа должна выводить 10 раз текст, указанный в задании. Каждый вывод - с новой строки.
В программе необходимо использовать цикл while.
*/

import java.util.Scanner;

public class Solution_15 {

	public static void main(String[] args) {
		String text = " любит меня.";
		Scanner console = new Scanner (System.in);
		String name = console.nextLine();
		int x = 0;
        while (x < 10) {
        	System.out.println(name + text);
            x++;
        }
		

	}

}
