package GenericClass;

public class GenericMain {
    public static void main(String[] args) {

        Print<String> printObj = new Print<>("Printing");
        printObj.print();
    }
}
