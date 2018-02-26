import java.util.EnumSet; //allows for a range (seen in for) in an array

public class enums2 {
	public static void main(String[] args) {
		for (enumerations people : enumerations.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

		System.out.println("\nAnd now for the range of constants!\n");

		for (enumerations people : EnumSet.range(enumerations.girly, enumerations.candy))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	}
}
