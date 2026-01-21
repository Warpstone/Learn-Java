/*
	Поменять местами значения чтобы а имело значение b и наоборот;
	Третий способ (интересный, но не универсальный);
 */
public class Project_49_2 {
	static void main() {

		int a = 10;
		int b = 20;
		int c;

		c = b - a;
		b = c;
		c = a + b;
		a = c;

		System.out.println(a + " " + b);
	}
}
