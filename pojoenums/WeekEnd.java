package pojoenums;

/*
    An enum can have custom values as well
    Although the constructor is private it can still be invoked from
    the same class.
 */
public enum WeekEnd {
    FRIDAY(105,"Its Friday"),
    SATURDAY(106,"Its Saturday"),
    SUNDAY(107,"Its Sunday"),;

    private int val;
    private String desc;

    WeekEnd(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }

    public int getVal() {
        return this.val;
    }

    public String getDesc() {
        return this.desc;
    }

    public static WeekEnd valueEnumFromValue(int val) {
        for (WeekEnd weekEnd : WeekEnd.values()) {
            if (weekEnd.getVal() == val) {
                return weekEnd;
            }
        }
        return null;
    }

}
