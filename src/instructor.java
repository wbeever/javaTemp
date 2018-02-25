
public class instructor {
	private String girlName;
	
	public instructor(String name) {
		girlName=name;
	}
	public void setName(String name) {
		girlName=name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your gf name is %s", getName());
	}
}
