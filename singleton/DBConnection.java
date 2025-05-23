package singleton;

public class DBConnection {

    /*
        new DBConnection can still create object because it
        is same class.

        Making this DBConnection instance as private restricts its use
        outside class and static makes it pre-loaded in memory.

        Hence, the name Eager initialization
     */
    private static DBConnection instance = new DBConnection();

    /*
        When a constructor is made private its object can't be created
        outside this class.
     */
    private DBConnection() {

    }

    /*
                .map(c -> EnumDesc.of(c, name));
        public static method allows the use of instance.
     */
    public static DBConnection getInstance() {
        return instance;
    }

}
