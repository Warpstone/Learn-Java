import java.util.Scanner;

public class Solution_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int money = scanner.nextInt();
		int honey = scanner.nextInt();
		
		int MoneyAfterShopping = money - honey;                          // Узнаем разницу сколько останется денег после покупки
		int child = MoneyAfterShopping >= 50 ? 10 : 5;                   // Прописываем условие и узнаем вознаграждение ребенка после покупки 
		MoneyAfterShopping -= MoneyAfterShopping >= 50 ? 10 : 5;
		
		System.out.println(child);
		System.out.println(MoneyAfterShopping);

	}

}
