package org.milestone3.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

    // creo attributi di evento
    private String title;
    private LocalDate date;
    private final int totalSeat;
    private int reservedSeat;

    // creo costruttore eventi
    public Evento(String title, LocalDate date, int totalSeat) {

        this.title = title;
        this.date = date;
        this.totalSeat = totalSeat;
        this.reservedSeat = 0;

        //  controllo dei posti totali e data come da consegna
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Data errata! Hai inserito una data passata: correggila per favore!!!");
        }

        if (totalSeat <= 0) {
            throw new IllegalArgumentException("Hai inserito una cifra negativa!!! Per favore riscrivi correttamente il numero di posti disponibili!!");
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public int getReservedSeat() {
        return reservedSeat;
    }

    // inserisco metodo public prenota
    public void prenota() {
        if (date.isBefore(LocalDate.now())) {
            System.out.println("Mi dispiace! L'evento per la quale stai cercando di prenotare è già passato");
        } else if (reservedSeat >= totalSeat) {
            System.out.println("Mi dispiace ma i posti totali nel teatro/stadio sono occupati!");
        } else {
            reservedSeat++;
            //System.out.println("Prenotazione effettuata con successo!"); <---- tolto perchè se no veniva ripetuto quante erano le prenotazioni
        }

    }

    // metodo disdici
    public void disdici() {
        if (date.isBefore(LocalDate.now())) {
            System.out.println("Mi dispiace! L'evento per la quale stai cercando di disdire è già passato ");
        } else if (reservedSeat <= 0) {
            System.out.println("Mi dispiace ma non vi sono posti o prenotazioni da disdire!");
        } else {
            reservedSeat--;
            System.out.println("Disdetta effettuata con successo!");
        }
    }

    // override con metodo toString
    @Override
    public String toString() {
        DateTimeFormatter eventDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Il giorno " + date.format(eventDate) + " vi si terrà l'attesissimo evento " + title;
    }
    /*public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    } totaly wrong */
}
