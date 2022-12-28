/**
 * 
 */
package coursework_question4;

public abstract class User {
  private String fullname;
  private String regEx = "[A-Z]{1}[a-z]* [A-Z]{1}[a-z]*";

  public String getFullname() {
    return fullname;
  }

  public User(String fullname) {
    if (!fullname.matches(regEx)) {
      throw new IllegalArgumentException("Name is not in right format");
    }
    this.fullname = fullname;
  }

  public abstract String toString();

  public abstract String getName();
}
