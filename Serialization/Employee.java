package Serialization;

import java.io.Serializable;

/*
    Serializable is an interface:
    Serialization is a process of converting an Object State to Byte Stream.
    De-serialization is reverse of it.
 */
public class Employee implements Serializable {

    /*
        It is better to declare this because if we don't declare it.
        JVM uses this serialVersionUID match the class when de-serializing.
     */
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;

    /*
        transient makes sure this variable will not be serialized
        and on de-serialized the variable is set to default value;
        in this case it will be null.
     */
    transient private String password;

    public Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
