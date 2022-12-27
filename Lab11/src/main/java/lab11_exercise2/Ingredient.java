package lab11_exercise2;

public class Ingredient {
	private String name;
	private IngredientType type;
	private Supplier supplier;
	private double rawWeight, calories, fat, sodium;

	public String getName() {
		return name;
	}
	public IngredientType getType() {
		return type;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public double getRawWeight() {
		return rawWeight;
	}
	public double getCalories() {
		return calories;
	}
	public double getFat() {
		return fat;
	}
	public double getSodium() {
		return sodium;
	}

	public Ingredient(String name, IngredientType type, Supplier supplier,
			double rawWeight, double calories, double fat, double sodium) {
		super();

		this.name = name;
		this.type = type;
		this.supplier = supplier;
		this.rawWeight = rawWeight;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
	}

	public double getCookedWeight() {
		return rawWeight * 0.80;
	}
}
