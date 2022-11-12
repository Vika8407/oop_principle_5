package class_object;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("White","BMW","X6",2020,15000);
        Car car2 = new Car("Black","Tesla","S" ,2023, 20000);
        Car car3 = new Car("Beige","Toyota","Camry" ,2018, 10000);
        Car car4 = new Car("Blue","Tesla","X" ,2021, 13000);
        Car car5 = new Car("Black","Audi","A7" ,2022, 15000);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars.forEach(System.out::println);
        System.out.println("\n---------- Find more expensive cars----------\n");
        /*
        Find the most expensive car
        Remove all the cars that has price more than or equal to 20k
         */
        Car mostExpensiveCar = cars.get(0);

        for (Car car : cars) {
            if (car.price > mostExpensiveCar.price)
                mostExpensiveCar=car;
        }
        System.out.println(mostExpensiveCar);

        System.out.println("\n---------- Count Black cars----------\n");
        // Find how many black cars

        int blackCar = 0;
        for (Car car : cars) {
            if (car.color.equals("Black"))blackCar++;

        }
        System.out.println(blackCar);

        System.out.println("\n---------- Count Black cars with stream ----------\n");
        System.out.println(cars.stream().filter(car -> car.color.equals("Black")).count());

        System.out.println("\n---------- Count  cars----------\n");

        // count all the cars that are Blue or Beige or 2023 -> 3


        /*
        Remove all the cars that are Tesla and print the size of the cars
        expected 3
         */
    }
}
