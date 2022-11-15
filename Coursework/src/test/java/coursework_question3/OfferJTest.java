package coursework_question3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OfferJTest {

  @Test
  public void coursework_testOffer() {
    User buyer = new Buyer("Adam Hills", 18);
    Offer offer = new Offer(buyer, 10);

    assertEquals("A***m", offer.getBuyer().toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void coursework_testInvalidOffer() {
    new Offer(null, 10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void coursework_testInvalidOfferValue() {
    User buyer = new Buyer("Mariyah Khan", 22);
    new Offer(buyer, -1);
  }

  @Test
  public void coursework_testToString() {
    User buyer = new Buyer("Mariyah Khan", 53);
    Offer offer = new Offer(buyer, 10000);
    assertEquals("M***h offered £10000.00", offer.toString());
  }

}
