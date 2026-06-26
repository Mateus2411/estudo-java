/**
 * EXERCÍCIO 5: Velocidade da Luz
 * 
 * Crie uma constante VELOCIDADE_DA_LUZ (3e8 m/s, ou seja, 300_000_000).
 * Calcule quanto tempo a luz leva para chegar até Marte
 * (~225 milhões de km = 225_000_000_000 metros).
 * 
 * Fórmula: tempo = distancia / velocidade
 * Resultado esperado: aproximadamente 750 segundos (~12,5 minutos).
 */
public class VelocidadeLuz {
    public static void main(String[] args) {
        //preguiça de deixar mais bem colocado
        
        final double velocidadeLuz = 3e8;
        double distancia = 225_000_000_000.0;
        double tempo = distancia / velocidadeLuz;
        System.out.printf("A luz leva %.0f segundos (%.1f minutos) para chegar a Marte\n", tempo, tempo / 60);
    }
}
