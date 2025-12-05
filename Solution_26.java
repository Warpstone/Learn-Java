import java.util.Scanner;

public class Solution_26 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		int min1 = Integer.MAX_VALUE;;
		int min2 = Integer.MAX_VALUE;;
		int count = 0;
		
		while (console.hasNextInt()) {
			int x = console.nextInt();
			count++;
			if (x < min1) {
				min2 = min1;
				min1 = x;
			} else if (x < min2 && x != min1) {
				min2 = x;
			}
		}
		if (count < 2) {
			
		}
		System.out.println(min2);
	}

}
