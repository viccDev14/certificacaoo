package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        System.out.println(zoneId);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(zoneId);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime2 = instant.atZone(zoneId);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.now(offset);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offset);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = instant.atOffset(offset);
        System.out.println(offsetDateTime3);

        JapaneseDate now1 = JapaneseDate.from(LocalDate.now());
        System.out.println(now1);
        LocalDate localDate = LocalDate.of(1900, 12, 1);
        JapaneseDate meijiEraLocalDate = JapaneseDate.from(localDate);
        System.out.println(meijiEraLocalDate);
    }
}
