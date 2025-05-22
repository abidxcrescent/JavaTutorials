package GenericClass;

/*
    T can be any non-primitive data type
    Generic classes helps us create classes or objects with unknown data type
    Allow us to decide the data type at run time
 */
public class Print<T> {

    /*
        The value of T will be decided at runtime.
     */
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
