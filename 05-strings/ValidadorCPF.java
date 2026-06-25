/**
 * EXERCÍCIO 4: Validador de CPF
 * 
 * Valide se uma string está no formato de CPF: 000.000.000-00
 * 
 * Use replaceAll para remover pontuação e verifique:
 *   - Se tem 11 dígitos após remover "." e "-"
 *   - Se matches() o regex \\d{11}
 * 
 * Dica: cpf.replaceAll("[.\\-]", "") remove pontos e traço.
 */
import java.util.Scanner;

public class ValidadorCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Leia uma string (formato CPF)
        
        // TODO: Valide o formato
        
        // TODO: Mostre "CPF válido" ou "CPF inválido"
        
        sc.close();
    }
}
