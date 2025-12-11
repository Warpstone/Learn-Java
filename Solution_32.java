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
        for (int i = start; i < end; i++) { // Цикл начинается со значения start и продолжается, пока i меньше end. Это гарантирует, что end не включается в сумму.
        	if (i % multiple !=0) {			// Оператор % (остаток от деления) используется для проверки кратности. Если остаток не равен нулю, значит, i не кратно multiple.
        		continue;					// Если условие в if истинно (т.е. число не кратно), continue немедленно завершает текущую итерацию цикла for и переходит к следующему значению i.
        	}
        	sum += i;         // Эта строка выполняется только в том случае, если число кратно multiple (т.е. если continue не был вызван).
        }
        System.out.println(sum);
	}

}
