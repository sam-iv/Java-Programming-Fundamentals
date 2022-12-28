package coursework_question2;

public class Offer {
  private double value;
  private User buyer;

  public String getBuyer() {
    return buyer.toString();
  }

  public double getValue() { // Temporary
    return this.value;
  }

  public Offer(User buyer, double value) {
    super();
    if (buyer == null || value <= 0) {
      throw new IllegalArgumentException("Cannot Instantiate Object");
    }
    this.buyer = buyer;
    this.value = value;
  }

  @Override
  public String toString() {
    return buyer.toString() + " offered £" + String.format("%.2f", value);
  }
}
