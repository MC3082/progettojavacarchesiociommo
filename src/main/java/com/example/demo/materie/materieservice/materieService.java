package com.example.demo.materie.materie_service;

import com.example.demo.materie.Materie;

public interface materieService {
    materie creatematerie (materie materie);

    Materie updatematerie (Materie materie);

    void deletematerie (Long id_materie);

    List<Materie> getAllmaterie();

    Materie getmaterie (Long id_materie);xx

}
