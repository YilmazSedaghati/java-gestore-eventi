package org.milestone3.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class ConcertoTest {

    public static void main(String[] args) {
          String title = "Black Sabbath at Birmingham";
            LocalDate date = LocalDate.of(2025, 8, 5);
            int totalSeat = 45000;
            LocalTime time = LocalTime.of(21, 30);
            BigDecimal price = new BigDecimal("509.00");

            Concerto concert1 = new Concerto(title, date, totalSeat, time, price);

            System.out.println("Creato concerto di prova per testare classe Concerto");
            System.out.println(concert1);
    }

}
