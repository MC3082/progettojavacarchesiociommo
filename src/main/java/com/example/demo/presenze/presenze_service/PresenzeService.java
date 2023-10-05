package com.example.demo.presenze.presenze_service;

import com.example.demo.presenze.Presenze;

public interface presenzeService {
    Presenze createpresenze (presenze presenze);

    Presenze updatepresenze (Presenze presenze);

    void deletepresenze (Long id_presenze);

    List<Presenze> getAllpresenze();

    Presenze getpresenze (Long id_presenze);xx

}