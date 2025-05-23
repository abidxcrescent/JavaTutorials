package singleton;

/*
    Lazy initialization
 */
public class Storage {

    /*
        Object is not created with eagerness,
        it is created when requested by using method getInstance();
     */
    private static Storage instance;

    private Storage() {

    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }

        return instance;
    }

}
