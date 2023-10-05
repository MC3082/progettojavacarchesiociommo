package com.example.demo.presenze

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudenteRepository extends JpaRepositry <Presenze, Long> {}