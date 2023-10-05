package com.example.demo.presenze;
import java.time.LocalDate;

@Entity
@Getter

public class Presenze {
    public Long getId_presenze() {
        @id_presenze
        @GeneratedValue
    }

    private Long id_presenze;
    private String data;
    private String stato;

}