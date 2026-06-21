package com.rpg;

import com.rpg.toolscreate.Monstros.ClasseMonstro;
import com.rpg.toolscreate.Monstros.TipoMonstro;

public class Monstro {
    private String nome;
    private ClasseMonstro classe;
    private TipoMonstro tipo;
    private int stage;

    private int vida;
    private int ataque;

    public Monstro(String nome, ClasseMonstro classe, TipoMonstro tipo, int stage, int vida, int ataque) {
        this.nome = nome;
        this.classe = classe;
        this.tipo = tipo;
        this.stage = stage;
        this.vida = vida;
        this.ataque = ataque;
    }
    public String getNome() {
        return nome;
    }

    public void status() {
        System.out.println(nome + " [" + classe + "]");
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }
}
