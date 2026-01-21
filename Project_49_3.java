/*
	Поменять местами значения чтобы а имело значение b и наоборот;
	Четвертый способ, самый верный;
 */

public class Project_49_3 {
	static void main() {

		int a = 10;
		int b = 20;
		int c;

		c = a;
		a = b;
		b = c;

		System.out.println(a + " " + b);

	}
}
