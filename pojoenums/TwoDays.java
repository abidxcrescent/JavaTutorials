package pojoenums;

/*
    Enum class with abstract
 */
public enum TwoDays {

    SATURDAY{
        @Override
        public void hello() {
            System.out.println("hello saturday");
        }
    },
    SUNDAY{
        @Override
        public void hello() {
            System.out.println("hello sunday");
        }
    };

    public abstract void hello();

}
