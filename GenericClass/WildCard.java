package GenericClass;

import java.util.List;

public class WildCard {

    /*
        Wild Card method
     */
    public void test(List<? extends Vehicle> source, List<? extends Vehicle> target) {

    }

    /*
        Generic type method
     */
    public<T extends Vehicle> void test2(List<T> source, List<T> target) {

    }

}
