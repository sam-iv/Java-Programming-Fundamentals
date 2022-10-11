/**
 * 
 */
package lab3;

/**
 * @author samiv
 *
 */
public class MailTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailSimple ms = new MailSimple("sender@surrey.ac.uk", "recipient@surrey.ac.uk", "Hello");
		ms.print();
		
		Email email = new Email("email@surrey.ac.uk");
		System.out.println(email.getEmailAddress());
		email.setEmailAddress("test@surrey.ac.uk");
		System.out.println(email.getEmailAddress());
		
		
	}

}
