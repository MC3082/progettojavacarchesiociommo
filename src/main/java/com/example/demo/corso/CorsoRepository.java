package com.example.demo.corso

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CorsoRepository extends JpaRepositry <Corso, Long> {}