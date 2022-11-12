package class_object;

public class Car {

    //Default constructor

    public Car(){

    }
    // create a 5 args overloaded  constractors

    public Car(String color, String make, String model, int years, double price) {
        this.color = color;
        this.model = model;
        this.make = make;
        this.price = price;
        this.years = years;
    }

    //instance varieble
    public String color ;
    public String model;
    public String make;
    public double price;
    public int years;

    // Override toString() Method
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", years=" + years +
                '}';
    }
}
