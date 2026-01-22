/*
	Еще один пример работы вложенного оператора if-else;
 */
public class Project_56 {
	static void main() {

		int i = 10;
		int j = 0;
		int a = 0, b = 0, c = 0, d = 0, k = 0;

		if (i == 10){
			if (j < 20) a = b;
			if (k > 100) c = d;                             // Этот оператор if связан
			else a = c;                                     // с этим else
		}
		else a = d;                                         // Этот оператор else относится к if (i == 10);
	}
}
