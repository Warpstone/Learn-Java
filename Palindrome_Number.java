/*
	Проверка числа на палидром;
 */
public class Palindrome_Number {
	static void main() {

		int n =121;
		int temp = n;
		int rev = 0;

		while(n > 0) {
			rev = rev*10 + n%10;
			n = n/10;
		}
		System.out.println(temp == rev);
	}
}
