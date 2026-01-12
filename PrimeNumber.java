/*
	Рекомендуемый вариант перебора до a;
 */

public class PrimeNumber {
	static void main() {

		int a = 97;

		if (a < 2) {
			System.out.println(false);                  // 0 и 1 - не простые;
			return;
		}

		boolean isPrime = true;

		for (int i = 2; i * i <= a; i++) {              // Проверяем делители только до квадратного корня из a;
			if (a % i == 0) {
				isPrime = false;
				break;                                  // Нашли делитель → сразу выход
			}
		}
		System.out.println(isPrime);
	}
}
