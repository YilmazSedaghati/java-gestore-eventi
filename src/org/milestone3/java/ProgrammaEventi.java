package org.milestone3.java;

import java.time.LocalDate;

public class ProgrammaEventi {

    private String titolo;
    private List<Evento> eventi;

    public ProgrammaEventi( String titolo) {
        this.titolo = titolo;
        this.eventi = new Array<>();

    }

    public void addEvento(Evento evento) {
        eventi.add(evento);
    }

    public int numberEventi() {
        return eventi.size();
    }

    public void svuota.Eventi() {
        eventi.clear();
    }

}
