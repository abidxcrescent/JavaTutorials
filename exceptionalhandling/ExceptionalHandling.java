package exceptionalhandling;

public class ExceptionalHandling {
    public static void main(String[] args) {
        ExceptionalHandling ex = new ExceptionalHandling();
        ex.method1();
    }

    public void method1(){
        method2();
    }

    public void method2(){
        method3();
    }

    public void method3(){
        int a  = 5/0;
    }

}
