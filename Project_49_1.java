/*
	Поменять местами значения чтобы а имело значение b и наоборот;
	Второй способ (он работает только с этими цифрами);
 */
public class Project_49_1 {
	static void main() {

		int a = 10;
		int b = 20;
		int c = 10;

		a = a + c;
		b = b - c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
