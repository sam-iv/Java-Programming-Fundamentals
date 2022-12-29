package coursework_question4;

import java.util.HashMap;

public abstract class Dealership {
  protected String name;
  protected HashMap<Advert, Seller> carsForSale;
  protected HashMap<Advert, Seller> unsoldCars;
  protected HashMap<Advert, Buyer> soldCars;

  public Dealership(String name) {
    super();
    this.name = name;

    carsForSale = new HashMap<>();
    soldCars = new HashMap<>();
    unsoldCars = new HashMap<>();
  }

  public abstract String displaySoldCars();

  public abstract String displayStatistics();

  public abstract String displayUnsoldCars();

  public abstract boolean placeOffer(Advert carAdvert, User user, double value);

  public abstract void registerCar(Advert advert, User user, String colour, CarType type,
      CarBody body, int numberOfSeats);
}
