//Feito pelo aluno: Gabriel Brandão Boaventura da Conceição

public class Car {
  private String licensePlate;
  private String chassinNumber;
  private String model;
  private String brand;
  private String yearOfManufacture;
  private float price;
  private CarType carType;

  /*
  public Car(String licensePlate, CarType carType){
    this.licensePlate = licensePlate;
    this.chassinNumber = chassinNumber;
    this.model = model;
    this.brand = brand;
    this.yearOfManufacture = yearOfManufacture;
    this.price = price;
    this.carType = carType;
  }
   */

  // CONSTRUTOR
  public Car(CarType carType) {
    this.carType = carType;
  }
}
