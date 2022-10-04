/**
 * 
 */
package lab2;

/**
 * @author si00483
 *
 */
public class NumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberInfo number = new NumberInfo(3);
		number.Increment();
		System.out.println(number.getValue());
		number.Increment();
		System.out.println(number.getValue());
		number.Increment();
		System.out.println(number.getValue());
		
		
		/*
		System.out.println("25 % 4 is " +(25%4));
		System.out.println("25 divide by 4 is " +(25/4));
		System.out.println("17 % 3 is " +(17%3));
		System.out.println("16+1 % 3 is " +((16+1)%3));
		System.out.println("17 divide by 3 is " +(17/3));
		System.out.println("16+1 divide by 3 is " +((16+1)/3));
		*/
	}

}
