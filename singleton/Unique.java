package singleton;
/*
    Synchronized way of creating a singleton class
 */
public class Unique {

    private static Unique instance;

    private Unique() {

    }

    /*
        Thread lock and unlock
     */
    synchronized public static Unique getInstance() {
        if (instance == null) {
            instance = new Unique();
        }

        return instance;
    }

}
