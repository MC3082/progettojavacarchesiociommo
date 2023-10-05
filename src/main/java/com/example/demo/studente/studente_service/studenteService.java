package com.example.demo.studente.studente_service;

import com.example.demo.studente.Studente;

public interface studenteService {
    studente createstudente (studente studente);

    Studente updatestudente (Studente studente);

    void deletestudente (Long id_studente);

    List<Studente> getAllstudente();

    Studente getstudente (Long id_studente);xx

}
