package ArrayPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("E dd/MMM/yyyy hh:mm:ss a");
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1.format(dtf));

    }
}