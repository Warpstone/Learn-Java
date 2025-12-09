import java.util.Scanner;
public class Solution_29 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("Сколько мандарин в коробке?");
		int mandarins = console.nextInt();
		
		for (int i = 0; i <= mandarins; i++) {
			System.out.println("Я уже почистил " + i + " мандарин");
		}

	}

}
