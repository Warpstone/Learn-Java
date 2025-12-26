public class Stack_trace {

	public static void main(String[] args) {

		one();
	}

	public static void one() {
		int a = 14;
		int b = 20;

		System.out.printf("one: a=%d, b=%d%n", a, b);

		two();

		b = 1000;
		System.out.println("one: a + b = " + a + b);

	}

	public static void two() {
		int c = 10;
		int d = 30;

		System.out.printf("two: c=%d, d=%d%n", c, d);

		three();

		c = 100;
		System.out.println("two: c + d = " + c + d);

	}

	public static void three() {
		int e = 11;
		int f = 27;

		System.out.printf("three: e=%d, f=%d%n", e, f);


	}
}
