public class Project_59 {
	static void main() {
		for (int i = 1; i <= 5; i++) {                  // Условие;
			for (int j = 2; j <= i; j++) {              // Пока выполняется верхнее условие, выполняется и внутреннее условие;
				System.out.print("*");
			}
			System.out.println();                       // Первый круг цикла завершился, новая строка;
		}
	}
}
