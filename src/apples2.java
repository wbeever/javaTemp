import java.util.Scanner;
public class apples2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		meth methObject = new meth();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		methObject.simpleMessage(name);
	}
}
