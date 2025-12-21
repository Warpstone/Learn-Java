/*
 * Сгенерировать 25 случайных чисел типа int. Для каждого значения if-else сообщает, в каком отношении оно находится с другим
 * случайно сгенерированным числом (больше, меньше, равно).
 */

import java.util.Random;

public class Solution_39 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for (int i = 0; i < 25; i++) {
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			
			if (a > b) {
				System.out.println(a + " больше " + b);
			} else if (a < b) {
				System.out.println(a + " меньше " + b);
			} else {
				System.out.println(a + " равно " + b);
			}
		}
		

	}

}
