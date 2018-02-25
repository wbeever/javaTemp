import java.util.Random;

public class arrayStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int freq[] = new int[7];
		change(freq);

		for (int roll = 1; roll < 1000; roll++) {
			++freq[1 + rand.nextInt(6)];
		}
		System.out.println("Face\tFrequency");

		for (int face = 1; face < freq.length; face++) {
			System.out.println(face + "\t" + freq[face]);
		}

		int total = 0;
		for (int y : freq) {
			total += y;
		}
		System.out.println("\t---");
		System.out.println("Rolls:\t" + total);
	}

	public static void change(int x[]) {
		for (int counter = 0; counter < x.length; counter++)
			x[counter] += 5;
	}

}
