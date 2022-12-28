/**
 * 
 */
package coursework_question1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author samiv
 *
 */
public class Auctioneer {
  protected String name;
  protected HashMap<Advert, User> carsForSale, soldCars, unsoldCars;

  public Auctioneer(String name) {
    super();
    this.name = name;

    carsForSale = new HashMap<>();
    soldCars = new HashMap<>();
    unsoldCars = new HashMap<>();
  }

  private boolean checkExistence(Car car) {
    boolean exists = false;
    for (Map.Entry<Advert, User> entry : carsForSale.entrySet()) {
      if (entry.getKey().getCar() == car) {
        exists = true;
      }
    }
    return exists;
  }

  public String displaySoldCars() {
    StringBuffer sb = new StringBuffer();
    sb.append("SOLD CARS:\n");
    for (Map.Entry<Advert, User> entry : soldCars.entrySet()) {
      sb.append(entry.getKey().getCar().getId() + " - Purchased by " + name + " with a successful £"
          + String.format("%.2f", entry.getKey().getHighestOffer().getValue()) + " bid.\n");
    }
    return sb.toString();
  }

  public String displayStatistics() {
    return "Statistics";
  }

  public String displayUnsoldCars() {
    StringBuffer sb = new StringBuffer();
    sb.append("UNSOLD CARS:\n");
    for (Map.Entry<Advert, User> entry : unsoldCars.entrySet()) {
      sb.append(entry.getKey().toString());
    }
    return sb.toString();
  }

  public void endSale(Advert advert) {
    if (advert == null) {
      throw new IllegalArgumentException();
    }
    if (!carsForSale.containsKey(advert)) {
      return;
    }

    if (advert.getHighestOffer().getValue() >= advert.getCar().getPrice()) {
      soldCars.put(advert, carsForSale.get(advert));
      carsForSale.remove(advert);
    } else {
      unsoldCars.put(advert, carsForSale.get(advert));
      carsForSale.remove(advert);
    }
  }

  public boolean placeOffer(Advert carAdvert, User user, double value) {
    if (carAdvert == null || user == null) {
      throw new IllegalArgumentException();
    }
    if (!checkExistence(carAdvert.getCar())) {
      return false;
    } else {
      carAdvert.placeOffer(user, value);
      return true;
    }
  }

  public void registerCar(Advert carAdvert, User user, String colour, CarType type, CarBody body,
      int noOfSeats) {
    if (carAdvert == null || user == null) {
      throw new IllegalArgumentException();
    }
    carAdvert.getCar().setGearbox(type);
    carAdvert.getCar().setColour(colour);
    carAdvert.getCar().setBody(body);
    carAdvert.getCar().setNumberOfSeats(noOfSeats);

    if (checkExistence(carAdvert.getCar())) {
      return;
    }
    carsForSale.put(carAdvert, user);
  }
}
