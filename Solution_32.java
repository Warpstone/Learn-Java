/*
 * В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
 * Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно), кратных multiple.
 * Для этого используй цикл for.
 * Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.
 * Требования:
 * Программа должна вывести в консоль сумму чисел от start (включительно) до end (не включительно), кратных multiple.
 * В программе необходимо использовать цикл for.
 * В цикле for необходимо использовать оператор continue.
 */

import java.util.Scanner;
public class Solution_32 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		int start = console.nextInt();
        int end = console.nextInt();
        int multiple = console.nextInt();
        
        int sum = 0;
        for (int i = start; i < end; i++) {
        	if (i % multiple !=0) {
        		continue;
        	}
        	sum += i;
        }
        System.out.println(sum);
	}

}
