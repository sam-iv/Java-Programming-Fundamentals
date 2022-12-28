package coursework_question4;

public class Offer {
  private double value;
  private User buyer;

  public Buyer getBuyer() {
    return (Buyer) buyer;
  }

  public double getValue() {
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
