package az.edu.bhos.lesson07;

import java.time.DayOfWeek;

public class WeekdayApp {

    public static void main(String[] args) {
        System.out.println(WeekdayEnum.SATURDAY);
        System.out.println(WeekdayEnum.SATURDAY.name());
        System.out.println(WeekdayEnum.SATURDAY.ordinal());
        System.out.println(WeekdayEnum.SATURDAY.getMoodLevel());

        System.out.println(DayOfWeek.SATURDAY);
        System.out.println(DayOfWeek.SATURDAY.name());
        System.out.println(DayOfWeek.SATURDAY.ordinal());
    }
}
