package org.milestone3.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Buongiorno! Benvenuto nel gestionale eventi: tramite me puoi inserire eventi di vario tipo, dai concerti, conferenze, spettacoli etc.. Partiamo subito! Inserisci il titolo dell'evento:");
            String title = input.nextLine();

            System.out.println("Qual è la data in cui si terrà l'evento? Inseriscila di seguito (formato yyyy-mm-dd):");
            LocalDate date = LocalDate.parse(input.nextLine());

            System.out.println("Quanti posti o biglietti totali sono disponibili nel tuo evento? Inserisci il numero dei posti di seguito: ");
            int totalSeat = Integer.parseInt(input.nextLine());

            Evento event = new Evento(title, date, totalSeat);
            System.out.println("Perfetto! Hai creato l'evento " + event);
            // punto due step due: prenotazioni effettuabili
            System.out.println("Quante posti vuoi prenotare?");
            int reservation = Integer.parseInt(input.nextLine());
            for (int i = 0; i < reservation; i++) {
                event.prenota();
            }
            System.out.println("Hai prenotato in tutto " + (event.getReservedSeat()) + " posti!");
            System.out.println("Hai ancora disponibili " + (event.getTotalSeat() - event.getReservedSeat()) + " posti!!");
            // punto 4 e 5 dello step 2
            System.out.println("Volento puoi effettuare anche delle disdette! Quante disdette hai da effettuare?");
            int cancellation = Integer.parseInt(input.nextLine());
            for (int i = 0; i < cancellation; i++) {
                event.disdici();
            }
            System.out.println("Hai prenotato in tutto " + (event.getReservedSeat()) + " posti!");
            System.out.println("Hai ancora disponibili " + (event.getTotalSeat() - event.getReservedSeat()) + " posti!!");

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());

        }

        input.close();

    }

}
