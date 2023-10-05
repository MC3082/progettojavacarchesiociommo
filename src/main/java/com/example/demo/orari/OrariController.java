package com.example.demo.orari;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrariController {
    private final orariService orariService;
    Public OrariController(OrariService orariService){
        this.orariService = orariService;
    }

    @GettMapping("/Orari")
    public List<Orari> getAllOrari(){
        return studenteService.getAllOrari();
    }

    @GetMapping("/Orari/{id_orari}")
    public Orari getOrari (@PathVariable Long id_orari) {
        return orariService.getOrari.getOrari{id_orari};
    }
    @PostMapping("/Orari")
    public Orari createOrari(Orari orari){
        return orari Orari.createorari(orari);
    }
    @PutMapping("/Orari/{id_orari}")
    public Orari updateOrari(@PathVariable Long id_orari, @Requestbody Orari orari){}

    @DeleteMapping ("/orari/{id:orari}")
    pubblic void DeleteOrari (@PathVariable Long id_orari){
        orariService.deleteorari(id_orari);
    }