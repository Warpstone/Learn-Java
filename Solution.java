// Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
// Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int number1 = scanner.nextInt();
    	int number2 = scanner.nextInt();
    	int number3 = scanner.nextInt();
    	
    	if (number1 == number2) { // Сначала мы проверяем условие, если все 3 числа раны между собой, то выводим на экран все три числа
    		if (number1 == number3) 
    		{
    			System.out.println(number1 + " " + number2 + " " + number3);
    		} 
    		else 
    		{
    			System.out.println(number1 + " " + number2); // Иначе (все три числа не равны) выводи равные пары чисел
    		}
    	} 
    	else if (number1 == number3) 
    	{
    		System.out.println(number1 + " " + number3);
    	}
    	else if (number2 == number3) 
    	{
    		System.out.println(number2 + " " + number3);
    	}
    }
}
