
import java.util.Scanner;

/**
 * EXERCÍCIO 2: Área de um círculo
 * 
 * Calcule a área de um círculo usando a fórmula:
 *   area = π * raio²
 * 
 * Use: final double PI = 3.14159;
 * 
 * Teste com raio = 5. O resultado deve ser aproximadamente 78.53975.
 */
public class AreaCirculo {
    public static void main(String[] args) {
        CalculoRaio area = new CalculoRaio();
        System.out.printf("A area e: %.5f",area.calcular());
    }
}
//simples e basico
class CalculoRaio{
    public double calcular(){
        double area = 0;
        try(Scanner sc = new Scanner(System.in);) {
            System.out.println("Diga o raio do circulo");
            double raio = sc.nextDouble();
            PI pi = new PI();
            area = pi.getPI() * Math.pow(raio, 2);
        } catch (Exception e) {
        }
        return area;
    }
}
class PI{
    private final double pi = Math.PI;

    double getPI(){
        return pi;
    }
}