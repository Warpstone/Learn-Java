public class Count_Vowels_in_a_String {
	static void main() {

		String ass = "Hello";
		int count = 0;
		for (char c : ass.toCharArray()) {
			if("aeiou".contains(c + "")) count++;
		}
		System.out.println(count);
	}
}
