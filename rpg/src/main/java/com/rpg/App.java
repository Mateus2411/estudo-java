package com.rpg;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Apresentacao apresentacao = new Apresentacao(sc);
        apresentacao.mostrarBoasVindas();

        String nome = apresentacao.pedirNome();
        String sexo = apresentacao.pedirSexo();
        apresentacao.mostrarInicio(nome, sexo);

        apresentacao.aguardarENTER();

        Treinamento treinamento = new Treinamento();
        treinamento.iniciar(nome);

        sc.close();
    }
}
