// Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x", а второе - координата "y"). 
// Известно, что точка не лежит на координатных осях OX и OY.
// Вывести на экран номер координатной четверти, в которой находится данная точка.
// Подсказка: Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:
//   для первой четверти x>0 и y>0;
//   для второй четверти x<0 и y>0;
//   для третьей четверти x<0 и y<0;
//   для четвертой четверти x>0 и y<0.


import java.util.Scanner;

public class Solution_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int number0 = scanner.nextInt();             // Координата Х
		int number1 = scanner.nextInt();             // Координата Y
		
		if (number0>0 && number1>0) {
			System.out.println("1");
		} else if (number0<0 && number1>0) {
			System.out.println("2");
		} else if (number0<0 && number1<0) {
			System.out.println("3");
		} else if (number0>0 && number1<0) {
			System.out.println("4");
		}
	}

}
