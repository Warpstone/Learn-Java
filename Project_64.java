import java.util.Random;
import java.util.*;
import static java.lang.System.out;

public class Project_64 {
	static void main() {
		Random rand = new Random(47);

		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			out.print ((char) c + ", " + c + ": ");
			switch (c){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': out.println ("Гласная");
					break;
				case 'y':
				case 'w': out.println ("Условная гласная");
					break;
				default: out.println ("Согласная");
			}
		}
	}
}
