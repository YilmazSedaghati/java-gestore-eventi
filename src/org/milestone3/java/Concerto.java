package org.milestone3.java;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento {

    private LocalTime hour; 
    private BigDecimal price;

    public Concerto(String title, LocalDate date, int totalSeat, LocalTime hour, BigDecimal price) {

        super(title, date, totalSeat);
        this.hour = hour;
        this.price = price;

    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour (LocalTime hour) {
        this.hour = hour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice (BigDecimal price) {
        this.price = price;
    }

    public String getDateHourForm ( ) {
        DateTimeFormatter concertDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter concertHour = DateTimeFormatter.ofPattern("HH:mm");

        return getDate().format(concertDate) + " " + hour.format(concertHour);
    }

    public String getPriceForm( ) {
        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);
        
        return euroFormat.format(price);
    }

    @Override
    public String toString ( ) {
        return getDateHourForm() + " - " + getTitle( ) + " - " + getPriceForm();
        }
}
