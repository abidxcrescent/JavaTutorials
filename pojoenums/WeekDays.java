package pojoenums;

/*
    We have an enum where we can override a method.
 */
public enum WeekDays {

    /*
        can use super.hello() which will call original hello
        or can Override it.
     */
    MONDAY{
        @Override
        public void hello() {
            super.hello();
            System.out.println("hello monday");
        }
    },
    TUESDAY,
    WEDNESDAY;

    public void hello(){
        System.out.println("hello weekdays");
    }
}
