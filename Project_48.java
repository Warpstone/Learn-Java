/*
	Пример работы типа long;
 */
public class Project_48 {
	static void main() {

		int lightspeed = 300000;                            // Приблизительная скорость света км/с;
		long days = 1000;                                   // Кол-во дней;
		long seconds = days * 24 * 60 * 60;                 // Преобразование в секунды;
		long distance = lightspeed * seconds;               // Расчет расстояния. Формула: S = v * t. S-расстояние, v-скорость, t-время;

		System.out.print("За " + days);
		System.out.print(" дней свет пройдет около ");
		System.out.println(distance + " километров.");
	}
}
