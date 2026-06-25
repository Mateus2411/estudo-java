import java.util.Scanner;

/**
 * EXERCÍCIO 2: Modifique o HelloWorld
 * 
 * Altere o programa HelloWorld para imprimir seu nome e idade.
 * Exemplo de saída esperada:
 *   Meu nome é Mateus
 *   Minha idade é 25 anos
 */
public class MeuNomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Meu nome é " + nome);
        System.out.println("Minha idade é " + idade + " anos");
        sc.close();
    }
}
