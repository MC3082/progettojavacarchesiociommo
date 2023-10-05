package com.example.demo.insegnante.insegnante_service;

import com.example.demo.insegnante.Insegnante;

public interface insegnanteService {
    studente createinsegnante (insegnante insegnante);

    Studente updateinsegnante (insegnante insegnante);

    void deleteinsegnante (Long id_insegnante);

    List<Insegnante> getAllInsegnante();

    Insegnante getinsegnante (Long id_insegnante);xx

}

