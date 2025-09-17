package com.pedrofl2001.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> listarNinjas() {
        return this.ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninja = this.ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDto) {
        NinjaModel ninja = new NinjaMapper().map(ninjaDto);
        ninja =  ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public void deletarNinjaPorId(Long id){
        this.ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(Long id, NinjaModel ninja) {
        if(ninjaRepository.existsById(id)){
            ninja.setId(id);
            return ninjaRepository.save(ninja);
        }

        return null;
    }
}
