package coursework_question2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AuctioneerJTest {

  Auctioneer auctioneer = new Auctioneer("Stella");

  @Test
  public void coursework_testAuctioneer() {
    auctioneer = new Auctioneer("Adam Hills");
  }

  @Test
  public void coursework_testDisplayNoSoldCars() {
    Car car = new Car(1234, "Mazda 3", 20000, Condition.NEW, SaleType.AUCTION);
    User seller = new User("Sid James");
    Advert ad = new Advert(car);

    auctioneer.registerCar(ad, seller, "Blue", CarType.AUTOMATIC, CarBody.HATCHBACK, 5);
    assertEquals("SOLD CARS:\n", auctioneer.displaySoldCars());
  }

  @Test
  public void coursework_testDisplaySoldCars() {
    Car car = new Car(1234, "Mazda 3", 20000, Condition.NEW, SaleType.AUCTION);
    User seller = new User("Sid James");
    User buyer = new User("Stella Kazamia");

    Advert ad = new Advert(car);

    auctioneer.registerCar(ad, seller, "Blue", CarType.AUTOMATIC, CarBody.HATCHBACK, 5);
    auctioneer.placeOffer(ad, buyer, 20000);
    auctioneer.endSale(ad);
    assertEquals("SOLD CARS:\n1234 - Purchased by Stella with a successful £20000.00 bid.\n",
        auctioneer.displaySoldCars());
  }

  @Test
  public void coursework_testDisplayStatistics() {
    assertEquals("Statistics", auctioneer.displayStatistics());
  }

  @Test
  public void coursework_testDisplayNoUnsoldCars() {
    Car car = new Car(1234, "Mazda 3", 20000, Condition.NEW, SaleType.AUCTION);
    User seller = new User("Sid James");
    User buyer1 = new User("Stella Kazamia");
    User buyer2 = new User("Bob Ross");

    Advert ad = new Advert(car);

    auctioneer.registerCar(ad, seller, "Blue", CarType.AUTOMATIC, CarBody.HATCHBACK, 5);
    auctioneer.placeOffer(ad, buyer1, 19999.99);
    auctioneer.placeOffer(ad, buyer2, 21000);
    auctioneer.endSale(ad);
    assertEquals("UNSOLD CARS:\n", auctioneer.displayUnsoldCars());
  }

  @Test
  public void coursework_testDisplayUnsoldCars() {
    Car car = new Car(1234, "Mazda 3", 20000, Condition.NEW, SaleType.AUCTION);
    User seller = new User("Sid James");
    User buyer = new User("Stella Kazamia");

    Advert ad = new Advert(car);

    auctioneer.registerCar(ad, seller, "Blue", CarType.AUTOMATIC, CarBody.HATCHBACK, 5);
    auctioneer.placeOffer(ad, buyer, 19999.99);
    auctioneer.endSale(ad);
    assertEquals("UNSOLD CARS:\n" + "Ad: 1234 - Mazda 3 (£20000.00)\n" + "\tType: AUTOMATIC\n"
        + "\tStyle: HATCHBACK\n" + "\tColour: Blue\n" + "\tNo. of Seats: 5\n"
        + "\tCondition: NEW\n", auctioneer.displayUnsoldCars());
  }

  @Test(expected = IllegalArgumentException.class)
  public void coursework_testInvalidEndSale() {
    auctioneer.endSale(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void coursework_testInvalidRegister() {
    auctioneer.registerCar(null, null, "Blue", CarType.AUTOMATIC, CarBody.HATCHBACK, 5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void coursework_testInvalidPlaceOffer() {
    auctioneer.placeOffer(null, null, 19999.99);
    auctioneer.endSale(null);
  }

  @Test
  public void coursework_testPlaceOffer() {
    Car car = new Car(8907, "Mazda 3", 4000, Condition.USED, SaleType.AUCTION);
    User seller = new User("Sid James");
    User buyer = new User("Stella Kazamia");

    Advert ad = new Advert(car);

    auctioneer.registerCar(ad, seller, "Blue", CarType.AUTOMATIC, CarBody.HATCHBACK, 5);

    assertTrue(auctioneer.placeOffer(ad, buyer, 4005));
  }

}
