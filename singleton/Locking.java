package singleton;

/*
    Double check
 */
public class Locking {

    // Volatile skips L1 cache and directly perform all read/write operations
    // from memory. This avoids sync issues between threads.
    private static volatile Locking instance;

    private Locking() {

    }


    public static Locking getInstance() {
        if (instance == null) {
            synchronized (Locking.class) {
                if (instance == null) {
                    instance = new Locking();
                }
            }
        }
        return instance;
    }

}
