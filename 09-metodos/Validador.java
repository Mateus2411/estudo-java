/**
 * EXERCÍCIO 5: Classe Validador
 * 
 * Crie uma classe Validador com métodos estáticos:
 *   - isEmail(String) → verifica se contém @ e um ponto após o @
 *   - isCPF(String) → verifica se tem 11 dígitos (formato simples)
 *   - isTelefone(String) → verifica se tem 10 ou 11 dígitos
 * 
 * Use String.matches() com expressões regulares.
 * 
 * Dicas de regex:
 *   Email:    \\S+@\\S+\\.\\S+
 *   CPF:      \\d{11}
 *   Telefone: \\d{10,11}
 */
public class Validador {
    public static void main(String[] args) {
        // TODO: Teste os métodos estáticos
        
        // System.out.println(Validador.isEmail("teste@email.com")); // true
        // System.out.println(Validador.isCPF("12345678901"));       // true
        // System.out.println(Validador.isTelefone("47988776655"));  // true
    }
    
    // TODO: Crie método isEmail(String)
    // TODO: Crie método isCPF(String)
    // TODO: Crie método isTelefone(String)
}
