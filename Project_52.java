/*
	Переменные в типе char ведут себя подобно целым числам! Их можно увеличивать, уменьшать.
 */
public class Project_52 {
	static void main() {
			char ch1;
			ch1 = 'X';
			System.out.println("ch1 содержит " + ch1);
			ch1++;                                              // Инкрементировать (увеличить);
			System.out.println("ср1 теперь содержит " + ch1);
			ch1++;                                              // Инкрементировать (увеличить);
			System.out.println("ср1 теперь содержит " + ch1);
	}
}
