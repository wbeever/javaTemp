public class arrays {

	public static void main(String[] args) {

		int array1[][] = { { 9, 5, 7 }, { 5, 3, 4 }, { 4, 6, 7, 7, 3 } };
		int array2[][] = { { 32, 2, 1, 89 }, { 9, 8 }, { 4 } };
		System.out.println("This is the first array: ");
		display(array1);
		System.out.println("This is the second array: ");
		display(array2);
	}

	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}

}
