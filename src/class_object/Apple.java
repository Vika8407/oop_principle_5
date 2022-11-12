package class_object;

public class Apple {

    //default constructor is provided by java to create a zero argument object
    public Apple(){
        //each time you create an object , this block will be executed
        System.out.println("This is the default constructor");

    }
    // overloading constructor with 3 arrays
    public Apple(String color, double price, String taste) {
        this.color = color;
        this.price = price;
        this.taste = taste;
    }

    // instance  variables - fields - states - attribute
    public String color; // null
    public double price; //0.0
    public String taste; //null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
