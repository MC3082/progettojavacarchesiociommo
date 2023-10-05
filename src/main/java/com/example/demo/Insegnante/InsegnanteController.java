@RestController
public class InsegnanteController {
    private final insegnanteService insegnanteService;
    Public InsegnanteController(InsegnanteService insegnanteService){
        this.insegnanteService = insegnanteService;
    }

    @GettMapping("/Insegnante")
    public List<Insegnante> getAllInsegnante(){
        return InsegnanteService.getAllInsegnante();
    }

    @GetMapping("/Insegnante/{id_insegnante}")
    public Insegnante getInsegnante (@PathVariable Long id_insegnante) {
        return InsegnanteService.getInsegnante.getInsegnante{id_insegnante};
    }
    @PostMapping("/Insegnante")
    public Insegnante createInsegnante(Insegnante insegnante){
        return insegnante Insegnante.createinsegnante);
    }
    @PutMapping("/Insegnante/{id_insegnante}")
    public Insegnante updateInsgenante(@PathVariable Long id_insegnante, @Requestbody Insegnante insegnante){}

    @DeleteMapping ("/insegnante/{id:insegnante}")
    pubblic void DeleteInsegnante (@PathVariable Long id_insegnante){
        insegnanteService.deleteinsegnante(id_insegnante);
    }
