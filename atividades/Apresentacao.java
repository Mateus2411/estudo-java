package atividades;

import java.util.Scanner;

public class Apresentacao {
    /*Apresentar com os dados recebidos*/
    void apresentar(String nome, int idade, String cidade) {
        System.out.printf("Your name is: %s\nYour age is: %d\nYour city is: %s", nome, idade, cidade);
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {

            String nome;
            int idade;
            String cidade;

            System.out.println("Digita o nome ai");
            nome = sc.nextLine();
            System.out.println("Digita a idade ai");
            idade = sc.nextInt();
            System.out.println("Digita a cidade ai");
            cidade = sc.next();
            sc.close();

            /*Sleep da execução */
            Thread.sleep(1000);

            /*  Some com as coisa da tela */
            System.out.print("\033[H\033[2J");
            System.out.flush();

            Apresentacao ap = new Apresentacao();
            ap.apresentar(nome, idade, cidade);
        }
    }
}
