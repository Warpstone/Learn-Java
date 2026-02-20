import java.util.Scanner;

public class Project_67 {
	static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите возраст: ");
		int age = sc.nextInt();

		switch(age) {
			case 3: System.out.println("Ты еще маленький");
			break;
			case 7: System.out.println("Пора в школу");
			break;
			case 14: System.out.println("Пора задуматься о поступлении в техникум");
			break;
		}

	}
}
