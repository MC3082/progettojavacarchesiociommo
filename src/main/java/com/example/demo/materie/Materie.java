package com.example.demo.materie;
import java.time.LocalDate;

@Entity
@Getter

public class Materie {
    public Long getId_materie() {
        @id_materie
        @GeneratedValue
    }

    private Long id_materire;
    private String materie;

}
