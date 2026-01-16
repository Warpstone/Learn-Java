public class Fibonacci_Series {
	static void main() {

		int a = 0;
		int b = 1;

		System.out.print(a + " " + b + " ");

		for (int i = 2; i < 15; i++){
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
