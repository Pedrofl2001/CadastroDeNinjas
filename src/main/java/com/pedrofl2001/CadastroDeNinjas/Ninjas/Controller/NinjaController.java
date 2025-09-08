package com.pedrofl2001.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

        @GetMapping("/boasvindas")
        public String boasVindas(){
            return  "Essa é minha primeira mensagem nessa rota";
        }

        //Adicionar Ninja
        @PostMapping("/criar")
        public String criarNinja(){
            return "Ninja criado com sucesso";

        }

        //Procurar ninja por id
        @GetMapping("/ninja/id")
        public String buscarNinjaPorId(){
            return "Busca de ninja por id";
        }

        //Buscar todos os ninjas
        @GetMapping("/all")
        public String buscarNinjas(){
            return "Todos os ninjas";
        }

        //Alterar dados dos ninjas
        @PutMapping("/ninja/id")
        public String atualizarNinja(){
            return "Ninja Atualizado";
        }
        //Remover ninja
        @DeleteMapping("/ninja/id")
        public String deletarNinja(){
            return "Ninja deletado";
        }
}
