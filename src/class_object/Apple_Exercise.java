package class_object;

public class Apple_Exercise {
    public static void main(String[] args) {

        System.out.println("\n-------- Task 1 -------\n");

    /*
    create tree apple objects with
    Apple1 - Red - 0.5- sweet
    Apple2 -Yellow - 0.75 - Sweet
    Apple3 - Green  - 1.0 - Sour
     */

        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.price = 0.5;
        apple1.taste = "Sweet";
        System.out.println(apple1);

        Apple apple2 = new Apple();
        apple2.color = "Yellow";
        apple2.price = 0.75;
        apple2.taste = "Sweet";
        System.out.println(apple2);

        Apple apple3 = new Apple();
        apple3.color = "Green";
        apple3.price = 1.0;
        apple3.taste = "Sour";
        System.out.println(apple3);


        System.out.println("\n-------- Apple Array -------\n");

        /*
        count how many objects are sweet
        store your apples in array
         */

        Apple[] apples = {apple3,apple2,apple1};
       // System.out.println(Arrays.toString(apples));
       // System.out.println(apples.length);//3
       // System.out.println(apples[1]);// information apple2
       // System.out.println(apples[2].taste);// taste apple 3
        int count = 0;
        for (Apple apple : apples) {
            if (apple.taste.equals("Sweet"))count++;
        }
        System.out.println(count); //2

        System.out.println("\n-------- Task 2  -------\n");

        /*
        Create 5 Apple objects with 3 args constructor
        a1 -> Yellow. 0.5, Sour
        a2 -> Red. 0.75, Sour
        a3 -> Grean. 0.5, Sour
        a4 -> Yellow. 1.0, Sweet
        a5 -> Yellow. 1.5, Sweet

         */

        Apple a1 = new Apple("Yellow",0.5,"Sour");
        Apple a2 = new Apple("Red",0.75,"Sour");
        Apple a3 = new Apple("Green",0.5,"Sour");
        Apple a4 = new Apple("Yellow",1.0,"Sweet");
        Apple a5 = new Apple("Yellow",1.5,"Sweet");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        // with array
        Apple[] arr2 ={
                new Apple("Yellow",0.5,"Sour"),
         new Apple("Red",0.75,"Sour"),
         new Apple("Green",0.5,"Sour"),
         new Apple("Yellow",1.0,"Sweet"),
         new Apple("Yellow",1.5,"Sweet"),
         };
        System.out.println(arr2[2]);

        for (Apple apple : arr2){
            System.out.println(apple);
        }

        System.out.println("\n-------- Retrieve each info for each apple object and print it  -------\n");

        /*
        Yellow
        0.5
        Sour
         */
        for (Apple apple : arr2) {
            System.out.println(apple.color);
            System.out.println(apple.price);
            System.out.println(apple.taste);
            System.out.println("-----------");

        }



    }
}