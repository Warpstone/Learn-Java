/*
	Revers a String - Перевернуть строку (переставить буквы с конца вперед);
	В Java строки нумеруются с 0:
	0 -> J
	1 -> a
	2 -> v
	3 -> a
 */
public class Revers_a_String {
	static void main() {
		String s = "Java";
		String rev = "";                                    // Создаём пустую строку, в которую будем собирать перевёрнутую версию;
		for(int i = s.length()-1; i >= 0; i--) {            // Возвращает 4 (длина строки "Java" = 4 символа;
			rev += s.charAt(i);                             // Берём символ по индексу i и добавляем его в конец строки rev;
		}
		System.out.println(rev);
	}
}
