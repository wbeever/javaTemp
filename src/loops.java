
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int test = 6; // = set variable, == test variable if (test == 9) {
		 * System.out.println("yes"); } else { System.out.println("this is else"); }
		 */

		// if, if else, else

		int boy = 25;
		int girl = 40;

		if (boy <= 18 || girl >= 60) {
			System.out.println("wrong ages");
		} else if (boy >= 25 && girl <= 40) {
			System.out.println("a good match");
		} else {
			System.out.println("no match found");
		}
		System.out.println(boy > 25 ? "The good life" : "Getting there");
		// var > (property) ?true "do this" : ?false "do this"

		// while loops
		int counter = 0;
		while (counter < 10) {
			System.out.println("While loop round: " + counter);
			counter++;
		}

		// for loops
		for (int counts = 1; counts <= 10; counts += 2) {
			System.out.println("For loop round: " + counts);
		}

		// do..while loop
		int coun = 0;
		do { //will 'DO' this at least once
			System.out.println(coun);
			coun++;
		} while (coun <= 10);
	}
}
