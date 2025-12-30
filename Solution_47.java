import java.util.*;
import java.io.*;

public class Solution_47 {
	static void main() {

		Scanner console = new Scanner(System.in);

		if (!console.hasNext()) return;

		String name = console.next();
		int age = console.hasNextInt() ? console.nextInt() : 0;

		System.out.println("My name is " + name + " and my age is " + age + ".");

		console.close();

	}
}
