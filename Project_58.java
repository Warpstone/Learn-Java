/*
	Первое знакомство с оператором switch; Простой пример;
 */
public class Project_58 {
	static void main() {
		int grade = 4;
		switch (grade) {
			case 5:
				System.out.println("Отлично!");
				break;
			case 4:
				System.out.println("Хорошо.");
				break;
			case 3:
				System.out.println("Нужно подтянуть теорию");
				break;
			default:
				System.out.println("Нужно все переделать");
				break;
		}
	}
}
