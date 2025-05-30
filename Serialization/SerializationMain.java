package Serialization;

import java.io.*;

public class SerializationMain {

    public static void main(String[] args) {

        /*
            emp is object and its state constituents the values defined here
         */
        Employee emp = new Employee(1, "John Doe", "john@1234");

        /*
            Serialization of emp.
         */
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C://Users//Abid Ali//Documents//Java//ShreyanshJain//Serialized.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(emp);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialization completed");

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

        /*
            Deserialization of emp.
         */

        try {
            FileInputStream fileInputStream = new FileInputStream("C://Users//Abid Ali//Documents//Java//ShreyanshJain//Serialized.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // employee is a local object which will hold the state after deserialization.
            Employee employee = (Employee) objectInputStream.readObject();

            // As expected password will be null.
            System.out.println(employee.toString());

            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialization completed");


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

}
