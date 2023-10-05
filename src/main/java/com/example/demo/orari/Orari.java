package com.example.demo.orari;
import java.time.LocalDate;

@Entity
@Getter

public class Orari {
    public Long getId_orari() {
        @id_orari
        @GeneratedValue
    }

    private Long id_orari;
    private String ora_inizio;
    private String ora_fine;
    private String giorno_settimana;


}
