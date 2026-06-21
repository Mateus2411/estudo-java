package com.rpg;

import java.util.Scanner;

public class Apresentacao {

    private Scanner sc;

    public Apresentacao(Scanner sc) {
        this.sc = sc;
    }

    public void mostrarBoasVindas() {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║         BEM-VINDO AO MUNDO DE ARQUEA        ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("Neste mundo cheio de perigos e criaturas sombrias,");
        System.out.println("voce precisara lutar para sobreviver...");
        System.out.println();
        System.out.println("Mas antes, precisamos conhece-lo.");
        System.out.println();
    }

    public String pedirNome() {
        String nome;
        do {
            System.out.print("Qual sera o nome do/a aventureiro/a? ");
            nome = sc.nextLine();
        } while (nome.isEmpty());
        return nome;
    }

    public String pedirSexo() {
        String sexo;
        do {
            System.out.println("\nQual o seu sexo?");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            System.out.print("> ");
            sexo = sc.nextLine();
        } while (!sexo.equals("1") && !sexo.equals("2"));
        return sexo.equals("1") ? "Masculino" : "Feminino";
    }

    public void mostrarInicio(String nome, String sexo) {
        String pronome = sexo.equals("Masculino") ? "o" : "a";
        String tratamento = sexo.equals("Masculino") ? "aventureiro" : "aventureira";

        System.out.println();
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("Seja bem-vind" + pronome + ", " + nome + "!");
        System.out.println("Voce e " + pronome + " " + tratamento + " mais novo(a) desta terra.");
        System.out.println("Um dia, voce se tornara lend" + pronome + ".");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println();
    }

    public void aguardarENTER() {
        System.out.print("Pressione ENTER para continuar...");
        sc.nextLine();
    }
}
