/*
	Вычисляем площадь круга. Пример работы типа double;
	Второй способ;
 */
public class Project_50_1 {
	static void main() {
		double r = 10.0;                                     // Радиус;
		double area = Math.PI * Math.pow(r, 2);             // Math.pow (r,2) - это возведение в квадрат;
		System.out.println("Площадь круга: " + area);
	}
}
