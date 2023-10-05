package com.example.demo.insegnante;
import org.springframework.web.bind.annotation.RestController;

package com.example.demo.insegnante;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InsegnanteRepository extends JpaRepositry <Insegnante, Long> {}
