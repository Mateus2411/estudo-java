
import java.util.Scanner;

/**
 * EXERCÍCIO 4: Declaração de variáveis
 *
 * Declare 3 variáveis de tipos diferentes e inicialize com valores.
 * Você pode usar int, double, String e boolean.
 */
public class DeclaracaoVariaveis {

    public static void main(String[] args) {
        Declarar d = new Declarar();
        d.criar();
    }
}

class Declarar {

    public void criar() {
        String nome = "";
        int idade = 0;
        double altura = 0;
        boolean solteiro = false;
        try (Scanner sc = new Scanner(System.in);) {

            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();

            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            System.out.print("Digite sua altura (m): ");
            altura = sc.nextDouble();

            System.out.print("Você é solteiro? (true/false): ");
            solteiro = sc.nextBoolean();
        } catch (Exception e) {
        }
        // preguica de tratar o dado
        String mensagemF = "nome: " + nome + "\nidade: " + idade + "\naltura: " + altura + "\ncasado: " + solteiro;
        System.out.println(mensagemF);
    }
}
