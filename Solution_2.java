// Напишем программу, которая будет считывать с клавиатуры возраст. 
// Если возраст от 20 до 60 (включительно), то выводить ничего не нужно, иначе - вывести фразу "можно не работать". 
// Сделать это можно (и нужно!) с помощью только одного оператора if без else.

import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int age = scanner.nextInt();
		if (age < 20 || age > 60) {                     // Если выполняется условие, то выводится фраза, если нет, то ничего не выводится
			System.out.println("Можно не работать");
		}
		
		

	}

}
