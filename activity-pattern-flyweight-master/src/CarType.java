public class CarType {
  private String licensePlate;
  private String chassinNumber;
  private String model;
  private String brand;
  private String yearOfManufacture;
  private float price;

   /*
  public CarType(String licensePlate, String chassinNumber, String model, String brand, String yearOfManufacture, float price){
    this.licensePlate = licensePlate;
    this.chassinNumber = chassinNumber;
    this.model = model;
    this.brand = brand;
    this.yearOfManufacture = yearOfManufacture;
    this.price = price;
  }
    */

  // CONSTRUTOR
  public CarType(String model) {
    this.model = model;
  }
}
