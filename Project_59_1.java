/*
	Рисуем прямоугольник как в задаче 59, но наоборот сверху вниз;
 */
public class Project_59_1 {
	static void main() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
