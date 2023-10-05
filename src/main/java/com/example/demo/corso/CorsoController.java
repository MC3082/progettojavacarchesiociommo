package com.example.demo.studente;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsoController {
    private final corsoService corsoService;
    Public CorsoController(CorsoService corsoService){
        this.corsoService = corsoService;
    }

    @GettMapping("/Corso")
    public List<Corso> getAllCorso(){
        return corsoService.getAllCorso();
    }

    @GetMapping("/Corso/{id_corso}")
    public Corso getCorso (@PathVariable Long id_corso) {
        return corsoService.getCorso.getCorso{id_corso};
    }
    @PostMapping("/Corso")
    public Corso createCorso(Corso corso){
        return corso Corso.createcorso(corso);
    }
    @PutMapping("/Corso/{id_corso}")
    public Corso updateCorso(@PathVariable Long id_corso, @Requestbody Corso corso){}

    @DeleteMapping ("/corso/{id:corso}")
    pubblic void DeleteCorso (@PathVariable Long id_corso){
        corsoService.deletecorso(id_corso);
    }