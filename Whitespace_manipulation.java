
public class Whitespace_manipulation {

	public static void main(String[] args) {
		char symbol = 'Б';
		int desiredSpaces = 18;
		String result = "" + symbol; // Строка начнется с первого символа
		int counter = 0; // Инициализация счетчика для цикла
		while (counter < desiredSpaces) {
			result = result + " "; // Добавляем один пробел к строке
			counter++;
		}
		result = result + symbol; // Добавляется второй исмвол
		System.out.println(result);
		System.out.println("Длина строки:" + result.length());

	}

}
