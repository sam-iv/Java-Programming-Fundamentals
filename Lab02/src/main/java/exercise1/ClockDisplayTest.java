/**
 * 
 */
package exercise1;

/**
 * @author si00483
 *
 */
public class ClockDisplayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockDisplay clock = new ClockDisplay();
		
		for (int i = 0; i < 864; i++) {
			clock.timeTick();
			System.out.println(clock.toString());
		}
	}

}
