/*
	Как в этой программе работает оператор switch-case.
	11 шагов цикла.
	ВСЕ ПРАВИЛЬНО ИЗНАЧАЛЬНО ПОНЯЛ!
	Первые 4 шага цикл доходит только до case 4 и делает break;
	Начиная с 5 шага (i = 5 = case 5) цикл идет дальше case 4, до case 9 и так 5 раз;
 */
public class Project_62 {
	static void main() {
		for (int i = 1; i < 12; i++) {
			switch (i) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
					System.out.println("i меньше 5");
					break;
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.println("i меньше 10");
					break;
				default:
					System.out.println("i больше или равно 10");
			}

		}
	}
}
