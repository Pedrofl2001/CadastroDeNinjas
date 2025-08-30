package com.pedrofl2001.CadastroDeNinjas.Missoes;
import com.pedrofl2001.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private char dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

    public MissaoModel(Long id, String nome, char dificuldade) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public MissaoModel() {
    }

    public Long getId() {
        return id;
    }


    public char getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(char dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
