package coursework_question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdvertJTest {
  Advert advert = null;
  Car car = new Car(6969, "Mercedes-Benz EQC", 72335, Condition.NEW);
  User buyer1 = new User("Samuel Ivuerah");
  User buyer2 = new User("***REMOVED***");

  @Test
  public void coursework_testAdvertConstruction() {
    advert = new Advert(car);

    assertEquals(car, advert.getCar());
  }

  @Test(expected = IllegalArgumentException.class)
  public void coursework_testInvalidAdvert() {
    advert = new Advert(null);
  }

  @Test
  public void coursework_testHighestOffer() {
    advert = new Advert(car);
    advert.placeOffer(buyer1, 3000);
    advert.placeOffer(buyer2, 4000);

    assertEquals(buyer2.getName(), advert.getHighestOffer().getBuyer().getName());
  }

  @Test
  public void coursework_testPlaceOffer() {
    Offer offer = new Offer(buyer2, 3000);
    advert = new Advert(car);
    advert.placeOffer(buyer2, 3000);

    assertEquals(offer.toString(), advert.getOffers().get(0).toString());
  }

  @Test
  public void coursework_testToString() {
    advert = new Advert(car);
    car.setBody(CarBody.HATCHBACK); // Making sure the advert is realistic
    car.setColour("Black");
    car.setGearbox(CarType.AUTOMATIC);
    car.setNumberOfSeats(5);

    assertEquals("Ad: " + car.displayCarSpecification() + "\n", advert.toString());
  }
}
