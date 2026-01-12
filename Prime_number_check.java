/*
	Проверка простого числа. Проверяем, если 11 простое число;
 */

public class Prime_number_check {
	static void main() {
		int n = 11, count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) count++;
		}
		System.out.println(count == 2);

	}
}
