package az.edu.bhos.lesson07;

public enum WeekdayEnum {

    MONDAY(0),
    TUESDAY(2),
    WEDNESDAY(5),
    THURSDAY(3),
    FRIDAY(2),
    SATURDAY(10),
    SUNDAY(6);

    private final int moodLevel;

    WeekdayEnum(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }
}
