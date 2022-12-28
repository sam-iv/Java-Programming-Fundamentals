package coursework_question3;

public class Seller extends User {
  public Seller(String fullname) {
    super(fullname);
  }

  @Override
  public String toString() {
    return getFullname().substring(0, getFullname().indexOf(' ') + 2) + ". ()";
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return getFullname().substring(0, getFullname().indexOf(' '));
  }
}
