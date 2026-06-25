/**
 * EXERCÍCIO 5: Troca de variáveis sem auxiliar
 * 
 * Troque o valor de duas variáveis SEM usar uma terceira variável.
 * Use apenas operadores de + e - (ou * e /).
 * 
 * Exemplo:
 *   int a = 10, b = 20;
 *   // Após a troca: a = 20, b = 10
 * 
 * Dica: use a = a + b; b = a - b; a = a - b;
 */
public class TrocaVariaveis {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Antes: a = " + a + ", b = " + b);
        
        // TODO: Troque os valores sem usar terceira variável
        
        System.out.println("Depois: a = " + a + ", b = " + b);
    }
}
