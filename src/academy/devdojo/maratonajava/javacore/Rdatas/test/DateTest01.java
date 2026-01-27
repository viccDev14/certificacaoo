package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1769550715418L); // Long 100000
        date.setTime(date.getTime() + 1_000_000);
        System.out.println(date);

    }
}
