package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratableMain {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Print using iterator

        Iterator<Integer> iterator  = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();
            System.out.println(number);
            if(number == 3){
                iterator.remove();
            }

        }

        // print using enhanced for loop

        for (Integer number : numbers) {
            System.out.println(number);
        }

        // print using lambda expression forEach

        numbers.forEach((Integer number) -> System.out.println(number));


    }
}
