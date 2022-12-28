package coursework_question4;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Dealership dealership = new Trader("AutoTrader");

    Car car3 = new Car(3456, "Nissan Micra", 7000, Condition.NEW, SaleType.FORSALE);
    Car car4 = new Car(1234, "Mercedes", 10000, Condition.USED, SaleType.FORSALE);

    Advert ad3 = new Advert(car3);
    Advert ad4 = new Advert(car4);

    Buyer user = new Buyer("Bob Ross", 18);
    Buyer user2 = new Buyer("Alice Wonderland", 50);

    Seller seller2 = new Seller("Adam Hills");

    dealership.registerCar(ad3, seller2, "Silver", CarType.AUTOMATIC, CarBody.MICRO, 4);
    dealership.registerCar(ad4, seller2, "Black", CarType.AUTOMATIC, CarBody.CABRIOLET, 4);

    dealership.placeOffer(ad3, user, 6000); // no
    dealership.placeOffer(ad3, user2, 6500); // no
    dealership.placeOffer(ad3, user, 8000);

    System.out.println(dealership.displaySoldCars());
    System.out.println(dealership.displayUnsoldCars());

    dealership.placeOffer(ad4, user2, 10000);

    System.out.println(dealership.displaySoldCars());
    System.out.println(dealership.displayUnsoldCars());
  }

}
