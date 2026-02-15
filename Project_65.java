public class Project_65 {
	static void main() {

		String tex = "кошка";
		String res = tex.replace('к', 'м');
		System.out.println(res);

		String phrase = "Мама мыла раму, мама устала";
		String resu = phrase.replace("мама", "папа");
		System.out.println(resu);                                             // Тк Java строг к регистру, то замена будет одного слова "мама".

		String secret = "Мой номер 123-456";
		String resul = secret.replaceAll("\\d", "*");       // \\d — это шаблон для любой цифры.
		System.out.println(resul);

		String text = "один, один, один";
		String result = text.replaceFirst("один", "два");   // Останавливается после того как найдет первое совпадение.
		System.out.println(result);

	}
}
