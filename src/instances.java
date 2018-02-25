
public class instances {
	private String girlName; //creates a local var, only avail in this class
	public void setName(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your gf was %s", getName());
	}

}
