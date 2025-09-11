package com.pedrofl2001.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return this.ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninja = this.ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninja){
        return this.ninjaRepository.save(ninja);
    }

}
