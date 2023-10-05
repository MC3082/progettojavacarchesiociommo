package com.example.demo.studente

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudenteRepository extends JpaRepositry <Studente, Long> {}

