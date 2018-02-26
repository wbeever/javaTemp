
public enum enumerations {

	beever("nice", "99"), girly("cutie", "10"), julie("big", "12"), mandy("old", "60"), candy("weird",
			"35"), alice("wonder", "30");

	private final String desc;
	private final String year;

	enumerations(String description, String birthday) {
		desc = description;
		year = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public String getYear() {
		return year;
	}
}
