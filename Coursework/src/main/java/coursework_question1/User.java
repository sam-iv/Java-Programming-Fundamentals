/**
 * 
 */
package coursework_question1;

public class User {
  private String fullname;
  private String regEx = "[A-Z]{1}[a-z]* [A-Z]{1}[a-z]*";

  public String getName() {
    return fullname.substring(0, fullname.indexOf(' '));
  }

  public User(String fullname) {
    if (!fullname.matches(regEx)) {
      throw new IllegalArgumentException("Name is not in right format");
    }
    this.fullname = fullname;
  }

  @Override
  public String toString() {
    return fullname;
  }
}
