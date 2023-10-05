package com.example.demo.corso.corso_service;

import com.example.demo.corso.Corso;

public interface corsoService {
    corso createcorso (corso corso);

    Corso updatecorso (Corso corso);

    void deletecorso (Long id_corso);

    List<Corso> getAllcorso);

    Corso getcorso (Long id_corso);xx

}