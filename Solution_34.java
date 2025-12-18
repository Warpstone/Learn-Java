// Перебор всех ASCII-символов нижнего регистра

public class Solution_34 {

	public static void main(String[] args) {
		for (char c = 0; c < 128; c++) {
			if (Character.isLowerCase(c))
				System.out.println("Значение: " + (int)c + " символ: " + c);
		}

	}

}
