import java.util.Scanner;

public class Solution_10 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		String line0 = console.nextLine();
		String line1 = console.nextLine();
		if (line0.equals(line1)) {
			System.out.println("Эти строки одинаковы");
		} else {
			System.out.println("Эти строки разные");
		}

	}

}
