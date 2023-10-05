package com.example.demo.insegnante;
import java.time.LocalDate;

@Entity
@Getter

public class Insegnante {
    public Long getId_insegnante() {
        @id_insegnante
        @GeneratedValue
    }

    private Long id_insegnante;
    private String nome;
    private String cognome;
    private String materia;


}
