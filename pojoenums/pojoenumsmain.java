package pojoenums;

public class pojoenumsmain {
    public static void main(String[] args) {

        /*
            Common methods used in enums are:
            a. values();
            b. ordinal();
            c. valuesOf();
            d. name();
         */

        for(DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            System.out.println(daysOfWeek.toString() + " " + daysOfWeek.ordinal());
        }

        DaysOfWeek daysOfWeek = DaysOfWeek.valueOf("MONDAY");
        System.out.println(daysOfWeek.toString());

        WeekEnd weekEnd = WeekEnd.valueEnumFromValue(105);
        System.out.println(weekEnd);

        WeekDays weekDays = WeekDays.valueOf("MONDAY");
        weekDays.hello();

        TwoDays twoDays = TwoDays.valueOf("MONDAY");
        twoDays.hello();
    }
}
