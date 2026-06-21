package com.rpg.toolscreate.Monstros;

import com.rpg.Monstro;
import java.util.Random;

public class FabricarMonstro {

    private static Random random = new Random();

    private static final TipoMonstro[][] MONSTROS_POR_STAGE = {
        {TipoMonstro.SLIME, TipoMonstro.ESQUELETO, TipoMonstro.ZUMBI},
        {TipoMonstro.GOBLIN, TipoMonstro.LOBO, TipoMonstro.FANTASMA},
        {TipoMonstro.ORC, TipoMonstro.TROLL, TipoMonstro.MINI_DEMONIO},
        {TipoMonstro.GARGULA, TipoMonstro.REI_CAIDO, TipoMonstro.DEMONIO},
        {TipoMonstro.ARC_DEMONIO, TipoMonstro.DRAGAO, TipoMonstro.BOSS_FINAL}
    };

    public static Monstro criarMonstroAleatorio(int stage) {
        if (stage < 1 || stage > 5) {
            throw new IllegalArgumentException("Stage deve ser entre 1 e 5");
        }
        TipoMonstro[] monstrosDoStage = MONSTROS_POR_STAGE[stage - 1];
        TipoMonstro tipo = monstrosDoStage[random.nextInt(monstrosDoStage.length)];
        ClasseMonstro[] classes = ClasseMonstro.values();
        ClasseMonstro classe = classes[random.nextInt(classes.length)];
        return criarMonstro(tipo, stage, classe);
    }

    public static Monstro criarMonstro(TipoMonstro tipo, int stage, ClasseMonstro classe) {
        int vidaBase = 0;
        int ataqueBase = 0;

        switch (tipo) {
            case SLIME:
                vidaBase = 30;
                ataqueBase = 3;
                break;
            case ESQUELETO:
                vidaBase = 40;
                ataqueBase = 5;
                break;
            case ZUMBI:
                vidaBase = 50;
                ataqueBase = 7;
                break;
            case GOBLIN:
                vidaBase = 60;
                ataqueBase = 10;
                break;
            case LOBO:
                vidaBase = 70;
                ataqueBase = 12;
                break;
            case FANTASMA:
                vidaBase = 80;
                ataqueBase = 15;
                break;
            case ORC:
                vidaBase = 100;
                ataqueBase = 18;
                break;
            case TROLL:
                vidaBase = 120;
                ataqueBase = 22;
                break;
            case MINI_DEMONIO:
                vidaBase = 140;
                ataqueBase = 25;
                break;
            case GARGULA:
                vidaBase = 160;
                ataqueBase = 28;
                break;
            case REI_CAIDO:
                vidaBase = 180;
                ataqueBase = 30;
                break;
            case DEMONIO:
                vidaBase = 200;
                ataqueBase = 35;
                break;
            case ARC_DEMONIO:
                vidaBase = 250;
                ataqueBase = 42;
                break;
            case DRAGAO:
                vidaBase = 300;
                ataqueBase = 50;
                break;
            case BOSS_FINAL:
                vidaBase = 500;
                ataqueBase = 70;
                break;
        }

        // Ajustar os atributos com base na classe
        switch (classe) {
            case FRACO:
                vidaBase *= 0.8;
                ataqueBase *= 0.8;
                break;

            case NORMAL:
                break;

            case ABILIDOSO:
                vidaBase *= 1.0;
                ataqueBase *= 1.1;
                break;

            case FORTE:
                vidaBase *= 1.2; // Aumenta a vida em 20%
                ataqueBase *= 1.2; // Aumenta o ataque em 20%
                break;
            case MINI_CHEFE:
                vidaBase *= 1.5; // Aumenta a vida em 50%
                ataqueBase *= 1.5; // Aumenta o ataque em 50%
                break;
            case CHEFE:
                vidaBase *= 2.0; // Aumenta a vida em 100%
                ataqueBase *= 2.0; // Aumenta o ataque em 100%
                break;
            case MONSTRUOSIDADE:
                vidaBase *= 3.0; // Aumenta a vida em 200%  
                ataqueBase *= 3.0; // Aumenta o ataque em 200%
                break;
        }

        return new Monstro(tipo.name(), classe, tipo, stage, (int) vidaBase, (int) ataqueBase);
    }
}
