package com.example.demo.corso;
import java.time.LocalDate;

@Entity
@Getter

public class Corso {
    public Long getId_corso() {
        @id_corso
        @GeneratedValue
    }

    private Long id_corso;
    private String nome_corso;
    private String descrizione;

}