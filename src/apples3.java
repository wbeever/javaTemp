import java.util.Scanner;
public class apples3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		instances instancesObject = new instances();
		
		System.out.println("Enter your gf name here: ");
		String name = input.nextLine();
		
		instancesObject.setName(name);
		
		instancesObject.saying();
	}
}
