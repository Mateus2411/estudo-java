/**
 * EXERCÍCIO 3: Duas classes no mesmo arquivo
 * 
 * Crie um programa com DUAS classes no mesmo arquivo.
 * Apenas uma pode ser public (a que tem o nome do arquivo).
 * A segunda classe não precisa do modificador public.
 * 
 * Exemplo: uma classe Saudacao e uma classe CalculadoraSimples.
 */
public class DuasClasses {
    public static void main(String[] args) {
        Auxiliar auxiliar = new Auxiliar();
        auxiliar.exibirMensagem();
    }
}

class Auxiliar {
    public void exibirMensagem() {
        System.out.println("Olá! Esta é a classe Auxiliar.");
    }    
}
