package exercise2;

public class Meal {
	private Food mainCourse;
	private Food dessert;
	
	public Meal(String name1, String name2, double sugar1, double sugar2) {
		super();
		this.mainCourse = new Food(name1, sugar1);
		this.dessert = new Food(name2, sugar2);
	}
	
	public double calculateTotalSugarLevel() {
		return mainCourse.getAmountOfSugar() + dessert.getAmountOfSugar();
	}

	@Override
	public String toString() {
		return "Meal [mainCourse = " + mainCourse.getName() + ", dessert = " + dessert.getName() + "]" + "\n" + 
				"Total amount of sugar: " + String.valueOf(calculateTotalSugarLevel()) + "g";
	}
}
