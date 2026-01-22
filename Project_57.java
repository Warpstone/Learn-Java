/*
	Еще один пример работы оператора if. Цепочка if-else-if;
 */
public class Project_57 {
	static void main() {

		int month = 4;                                          // Апрель;
		String season;

		if (month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if (month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if (month == 9 || month == 10 || month == 11)
			season = "Autumn";
		else
			season = "Non-existent Month";
		System.out.println("Апрель - это " + season + ".");
	}
}
