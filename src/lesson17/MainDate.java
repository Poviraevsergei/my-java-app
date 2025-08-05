package lesson17;

import java.util.Calendar;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        //LocalDate
        //LocalTime
        //LocalDateTime
        //System.out.println(LocalDate.now()); //2025-08-05 YYYY-MM-DD
        //System.out.println(LocalTime.now()); //21:11:20.690761
        //System.out.println(LocalDateTime.now()); //2025-08-05 YYYY-MM-DD

/*        LocalDate date = LocalDate.now();
        date = LocalDate.of(2025,1,1);

        String dateLine = "2021-10-01";
        date = LocalDate.of(2025,1,1);
        date = LocalDate.parse(dateLine);

        date = date.plusYears(1);
        date = date.plus(10l, ChronoUnit.CENTURIES);
        date = date.minus(10,ChronoUnit.DAYS);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.isLeapYear());

        System.out.println(date.isAfter(LocalDate.now()));
        System.out.println(date.isBefore(LocalDate.now()));

        System.out.println(date);

        ZoneId zoneId = ZoneId.of("Europe/Minsk"); //Asia/Dhaka
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, LocalTime.now(), zoneId);
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        System.out.println(localDateTime);
        String result = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(result);

        String input = "12122020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println(date);*/

        //Другие типы даты:
        //util
        Date d = new Date();
        System.out.println(d);

        //sql
        java.sql.Date dd = new java.sql.Date(125,1,1);
        System.out.println(dd);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
