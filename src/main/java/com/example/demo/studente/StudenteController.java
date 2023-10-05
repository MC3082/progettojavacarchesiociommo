package com.example.demo.studente;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudenteController {
    private final studenteService studenteService;
    Public StudenteController(StudenteService studenteService){
        this.studenteService = studenteService;
    }

    @GettMapping("/Studente")
    public List<Studente> getAllStudente(){
        return studenteService.getAllStudente();
    }

    @GetMapping("/Studente/{id_studente}")
    public Studente getStudente (@PathVariable Long id_studente) {
        return studenteService.getStudente.getStudente{id_studente};
    }
    @PostMapping("/Studente")
    public Studente createStudente(Studente studente){
        return studente Studente.createstudente(studente);
    }
    @PutMapping("/Studente/{id_studente}")
    public Studente updateStudente(@PathVariable Long id_studente, @Requestbody Studente studente){}

    @DeleteMapping ("/studente/{id:studente}")
    pubblic void DeleteStudente (@PathVariable Long id_studente){
        studenteService.deletestudente(id_studente);
    }
}
