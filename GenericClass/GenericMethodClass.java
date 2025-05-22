package GenericClass;

public class GenericMethodClass {

    private String value;

    public void setValue(String value){
        this.value = value;
    }

    /*
        Generic method which can accept anything except
        primitive data type.
     */
    public <T> void print(T value){
        System.out.println(value);
    }

}
