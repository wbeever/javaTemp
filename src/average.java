import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int avg;
		int counter = 0;

		while (counter < 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		avg = total / 10;
		System.out.println("Average is: " + avg);
		input.close();

	}

}
