public class BubbleSort {
	public static void main(String[] args) {

		int[] a = {5, 1, 4, 2, 8};

		for (int i = 0; i < a.length - 1; i++) {                    // Сколько раз мы "прогоняем" массив;

			for (int j = 0; j < a.length - 1 - i; j++) {            // Сравнение чисел в массиве;
																	// Почему a.length - 1? После каждого внешнего "прохода" один элемент точно на месте. Его больше не нужно трогать;
				if (a[j] > a[j + 1]) {                              // Сравнение и перестановка;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
