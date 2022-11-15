package lab7_exercise3;

public class Module {
	private String name;
	private String regEx = "[A-Z]{3}\\d{4}";

	public String getName() {
		return name;
	}

	public Module(String name) {
		if (name.matches(regEx)) {
			this.name = name;
		} else {
			this.name = "Error";
		}
	}
}
