package com.example.demo.studente;
import java.time.LocalDate;

@Entity
@Getter

public class Studente {
    public Long getId_studente() {
        @id_studente
                @GeneratedValue
    }

    private Long id_studente;
    private String nome;
    private String cognome;
    private LocalDate data_nascita;


}
