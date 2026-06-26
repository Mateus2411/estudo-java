
import java.util.Scanner;

/**
 * EXERCÍCIO 3: Conversão de temperatura
 *
 * Converta uma temperatura de Celsius para Fahrenheit.
 * Fórmula: F = (C * 9/5) + 32
 *
 * Teste com 25°C → deve dar 77°F.
 */
public class ConversaoTemperatura {

    public static void main(String[] args) {
        ConverterTemperatura c = new ConverterTemperatura();
        System.out.println(c.conversao() + "°F");
    }
}

class ConverterTemperatura {

    public int conversao() {
        int celcios;
        int fahrenheit;
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Diz ai a temperatura em celcios");
            celcios = sc.nextInt();

            fahrenheit = (celcios * 9 / 5) + 32;
            sc.close();
        }
        // preguiça de melhorar
        return fahrenheit;
    }
}
