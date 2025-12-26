public class ChristmasTree {
	static void main() {

		int height = 8;                                             // Высота елки;

		for  (int i = 0; i < height; i++) {                         // Внешний цикл — отвечает за каждый уровень ёлки (строку);
			for (int j = 0; j < height - i - 1; j++) {              // Печатаем пробелы слева;
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {                   // Печатаем пробелы справа;
				System.out.print("*");
			}
			System.out.println();                                   // Переход на новую строку после одного уровня ёлки;
		}
		for (int i = 0; i < height - 1; i++) {                      // Печатаем ствол елки. Смещаемся вправо чтобы он был по центру;
			System.out.print(" ");
		}
		System.out.println("|");
	}
}
