package lab8;
//1. Color - Strint
//2. Brand - Strint
//3. carID - Strint
//4. Engine (has-a relation) - Engine
public class Car {
    private  String color;
    private  String Brand;
    private  String carID;
    private  String engine;

    //constructor
    public  void  Car (){}

    public Car(String color, String brand, String carID, String engine) {
        this.color = color;
        Brand = brand;
        this.carID = carID;
        this.engine = engine;
    }
    //toString


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", Brand='" + Brand + '\'' +
                ", carID='" + carID + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
    //getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}//Class
