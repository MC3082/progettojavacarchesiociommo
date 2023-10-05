package com.example.demo.presenze;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresenzeController {
    private final presenzeService presenzeService;
    Public PresenzeController(PresenzeService presenzeService){
        this.presenzeService = presenzeService;
    }

    @GettMapping("/Presenze")
    public List<Presenze> getAllPresenze(){
        return presenzeService.getAllPresenze();
    }

    @GetMapping("/Presenze/{id_presenze}")
    public Presenze getPresenze (@PathVariable Long id_presenze) {
        return presenzeService.getPresenze.getPresenze{id_presenze};
    }
    @PostMapping("/Presenze")
    public Presenze createPresenze(Presenze presenze){
        return presenze Presenze.createpresenze(presenze);
    }
    @PutMapping("/Presenze/{id_presenze}")
    public Presenze updatePresenze(@PathVariable Long id_presenze, @Requestbody Presenze presenze){}

    @DeleteMapping ("/presenze/{id:presenze}")
    pubblic void DeletePresenze (@PathVariable Long id_presenze){
        presenzeService.deletepresenze(id_presenze);
    }