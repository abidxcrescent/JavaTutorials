package singleton;

/*
    Bill Pugh Solution
 */
public class Book {

    private Book() {

    }

    /*
        Inner class will not be loaded eagerly.
     */
    private static class BookHelper{
        private static final Book instance = new Book();
    }

    public static Book getInstance() {
        return BookHelper.instance;
    }

}
