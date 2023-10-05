package com.example.demo.materie;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterieController {
    private final materieService materieService;
    Public materieController(MaterieService materieService){
        this.materieService = materieService;
    }

    @GettMapping("/Materie")
    public List<Materie> getAllMaterie(){
        return materieService.getAllMaterie();
    }

    @GetMapping("/Materie/{id_materie}")
    public Materie getMaterie (@PathVariable Long id_materie) {
        return materieService.getMaterie.getMaterie{id_materie};
    }
    @PostMapping("/Materie")
    public Materie createStudente(Materie materie){
        return materie Materie.creatematerie(materie);
    }
    @PutMapping("/Materie/{id_materie}")
    public Materie updateMaterie(@PathVariable Long id_materie, @Requestbody Materie Materie){}

    @DeleteMapping ("/materie/{id:materie}")
    pubblic void DeleteMaterie (@PathVariable Long id_materie){
        materieService.deletematerie(id_materie);
    }
