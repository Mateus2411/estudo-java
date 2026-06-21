package com.rpg;

import com.rpg.toolscreate.Monstros.FabricarMonstro;

public class Treinamento {

    public void iniciar(String nome) {
        System.out.println("=== TREINAMENTO ===");
        System.out.println("Neste treinamento, voce enfrentara monstros de baixo nivel.");
        System.out.println("Vamos comecar com o Stage 1...\n");

        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Luta " + i + " ---");
            Monstro monstro = FabricarMonstro.criarMonstroAleatorio(1);
            monstro.status();
            System.out.println("Voce derrotou " + monstro.getNome() + "!");
            System.out.println();
        }

        System.out.println("═══════════════════════════════════════════════");
        System.out.println("Treinamento concluido!");
        System.out.println(nome + ", voce esta pronto para a aventura!");
        System.out.println("═══════════════════════════════════════════════");
    }
}
