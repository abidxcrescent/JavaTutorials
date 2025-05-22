package GenericClass;

public class GenericMain {
    public static void main(String[] args) {

        /*
            String is decided at runtime.
         */
        Print<String> printObj = new Print<>();
        printObj.setValue("Print");
        printObj.print();

        /*
            String is decided at compile type
         */
        ColorPrint colorPrint = new ColorPrint();
        colorPrint.setValue("Color Print");
        colorPrint.print();

        /*
            String is decided at runtime.
         */
        BWPrint<String> bwPrintObj = new BWPrint<>();
        bwPrintObj.setValue("BWPrint");
        bwPrintObj.print();

        /*
            Pair generic class.
         */
        Pair<Integer,String> pairObj = new Pair<>();
        pairObj.put(1,"Abid");
        pairObj.print();

        /*
            Upper bound is created on the class Bounded Generic for Vehicle
            Meaning Vehicle and its objects can be passed and nothing else.
         */
        BoundedGeneric<Vehicle> boundedGenericObj = new BoundedGeneric<>();
        BoundedGeneric<Car> boundedGenericCar = new BoundedGeneric<>();
        BoundedGeneric<Bike> boundedGenericBike = new BoundedGeneric<>();
        BoundedGeneric<Ship> boundedGenericShip = new BoundedGeneric<>();

        //This line will give compile time error.
        //BoundedGeneric<String> obj = new BoundedGeneric<String>();


    }
}
