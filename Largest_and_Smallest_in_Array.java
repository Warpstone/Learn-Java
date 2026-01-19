/*
	Поиск наименьшего и наибольшего числа в массиве;
 */
public class Largest_and_Smallest_in_Array {
	static void main() {

		int [] arr = {5, 9, 2, 7};
		int max = arr[0], min = arr[0];

		for (int i : arr) {
			if (i > max)  max = i;
			if (i < min)  min = i;
		}
		System.out.println(max + " " + min);
	}
}
