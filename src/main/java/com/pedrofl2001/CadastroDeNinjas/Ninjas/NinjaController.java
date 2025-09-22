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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return this.ninjaService.criarNinja(ninja);
    }

    //Procurar ninja por id
    @GetMapping("/listar/{id}")
    public NinjaDTO listarNinjasPorId(@PathVariable Long id) {
        return this.ninjaService.listarNinjasPorId(id);
    }

    //Buscar todos os ninjas
    @GetMapping("/listar")
    public List<NinjaDTO> listarNinjas() {
        return this.ninjaService.listarNinjas();
    }

    //Alterar dados dos ninjas
    @PatchMapping("/atualizar/{id}")
    public NinjaDTO atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaDTO) {
        return this.ninjaService.atualizarNinja(id, ninjaDTO);
    }

    //Remover ninja
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        this.ninjaService.deletarNinjaPorId(id);
    }
}
