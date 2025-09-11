package com.pedrofl2001.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar Ninja
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return this.ninjaService.criarNinja(ninja);
    }

    //Procurar ninja por id
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return this.ninjaService.listarNinjasPorId(id);
    }

    //Buscar todos os ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return this.ninjaService.listarNinjas();
    }

    //Alterar dados dos ninjas
    @PutMapping("/ninja/id")
    public String atualizarNinja() {
        return "Ninja Atualizado";
    }

    //Remover ninja
    @DeleteMapping("/ninja/id")
    public String deletarNinja() {
        return "Ninja deletado";
    }
}
