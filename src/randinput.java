
public class randinput {

	public static void main(String[] args) {
		System.out.println(average(43, 54, 35, 333, 94));
	}

	public static int average(int... numbers) {
		int total = 0;
		for (int x : numbers)
			total += x;
		return total / numbers.length;
	}
}
