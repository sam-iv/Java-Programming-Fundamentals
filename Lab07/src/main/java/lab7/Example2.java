package lab7;

import java.util.List;

/**
 * An example on how user-defined methods can be used to structure how
 * ArrayLists
 * 
 * @author Stella Kazamia
 *
 */
public class Example2 {

	// Create a list that holds Double values
	private List<Double> values;

	/**
	 * Define the list as an ArrayList in a default constructor
	 * 
	 */
	public Example2() {
		super();
//add your code here
	}

	/**
	 * In a UML, this would look like this: + addElement(in value: double)
	 */
	public void addElement(double value) {
		// add your code here
	}

	/**
	 * In a UML, this would look like this: + removeElement (in value: double)
	 */
	public void removeElement(double value) {
		if (checkifElementExists(value)) {
			// add your code here
		}
	}

	/**
	 * In a UML, this would look like this: - checkIfElementExists(in value:
	 * double): boolean
	 */
	private boolean checkifElementExists(double value) {
		// add your code here
		if (values.contains(value)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * In a UML, this would look like this: + retrieveElement(in index: int)
	 */
	public double retrieveElement(int index) {
		double value = 0;
		// add your code here
		return 0D;
	}

	/**
	 * In a UML, this would look like this: + displayList(): String
	 */
	public String displayList() {
		// add your code here
		return "";
	}

	/**
	 * In a UML, this would look like this: + displaysortedList(): String
	 */
	public String displayOrderedList() {
		// add your code here
		StringBuffer output = new StringBuffer();
		output.append("Ordered List\n");

		// add your code here
		return "";
	}

	/**
	 * In a UML, this would look like this: + calculateAverage(): double
	 */
	public double calculateAverage() {
		// add your code here
		return 0D;
	}

	/**
	 * The main method has been defined for you - Run the file as a Java Application
	 * and compare the output
	 */
	public static void main(String[] args) {
		Example2 test = new Example2();
		// add elements in the list
		test.addElement(75);
		test.addElement(100);
		test.addElement(50);

		// remove an element from the list
		test.removeElement(50);

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Using the .get method");
		System.out.println();

		// retrieve elements and display them on the console
		System.out.println("This is the value at index 0: " + test.retrieveElement(0));
		System.out.println("This is the value at index 2: " + test.retrieveElement(2));

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Displaying list");
		System.out.println();

		// display all the elements of the list
		System.out.println(test.displayList());

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Using the .sort method");
		System.out.println();

		// add one more element in the list
		test.addElement(50);

		// display all the elements of the list
		System.out.println(test.displayList());

		// display all the elements of the list (in an order)
		System.out.println(test.displayOrderedList());

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Applying arithmetic operations on list values");
		System.out.println();

		// calculate the average and display it on the console
		System.out.println(test.calculateAverage());

	}
}
