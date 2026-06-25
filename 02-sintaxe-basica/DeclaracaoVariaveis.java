import java.util.Scanner;

public class DeclaracaoVariaveis {

    // IA BURRA PRA KRLH
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeitorDados leitor = new LeitorDados(scanner);

        String nome = leitor.lerNome();
        int idade = leitor.lerIdade();
        double altura = leitor.lerAltura();
        boolean solteiro = leitor.lerSolteiro();

        leitor.mostrarDados(nome, idade, altura, solteiro);

        scanner.close();
    }
}
