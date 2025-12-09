/*
 * Распечатать 5-ть символов, в одну строку, начиная с h
 */

public class Solution_28 {

	public static void main(String[] args) {
		char symbol = 'h';
		for (int i = 0; i < 10; i++) {
			System.out.print(symbol++ + " ");
		}

	}

}
