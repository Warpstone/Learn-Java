public class Factorial_of_a_Number {
	static void main() {

		int a = 5;
		int fact = 1;

		for (int i =1; i <= a; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}
}
