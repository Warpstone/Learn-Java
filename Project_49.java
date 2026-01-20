/*
	Поменять местами значения чтобы а имело значение b и наоборот;
	Первый способ;
 */
public class Project_49 {
	static void main() {

		int a = 10;
		int b = 20;

		if (a > b || a < b) {
			a = 20;
			b = 10;
			System.out.println(a);
			System.out.print(b);
		}
	}
}
