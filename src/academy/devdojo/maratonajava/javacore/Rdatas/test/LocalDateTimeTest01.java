package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2006-10-14");
        LocalTime localTime = LocalTime.parse("12:12:12");
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
