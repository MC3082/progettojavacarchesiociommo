package com.example.demo.orari.orari_service;

import com.example.demo.orari.Orari;

public interface orariService {
    orari createorari (Orari orari);

    Orari updateorari (Orari orari);

    void deleteorari (Long id_orari);

    List<Orari> getAllorari();

    Orari getorari (Long id_orari);xx

}