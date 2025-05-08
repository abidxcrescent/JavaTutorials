package exceptionalhandling.CompiletimeException;

public class CTE {
    public static void main(String[] args) {

    }

    public void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }

}
