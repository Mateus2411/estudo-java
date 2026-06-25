/**
 * EXERCÍCIO 5: Interface funcional Filtro<T>
 * 
 * Crie uma interface funcional Filtro<T> com:
 *   boolean aceitar(T item)
 * 
 * Use @FunctionalInterface para garantir que só tem
 * um método abstrato.
 * 
 * Depois use com expressões lambda para filtrar:
 *   1. Lista de números → filtrar apenas pares
 *   2. Lista de strings → filtrar nomes com mais de 5 letras
 *   3. Lista de produtos → filtrar com preco > 50
 * 
 * Crie um método utilitário que recebe uma lista e um Filtro:
 *   List<T> filtrar(List<T> itens, Filtro<T> filtro)
 */
import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface Filtro<T> {
    boolean aceitar(T item);
}

public class InterfaceFuncionalFiltro {
    public static void main(String[] args) {
        // TODO: Crie listas e filtre com lambdas
        
        // Exemplo:
        // List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        // Filtro<Integer> apenasPares = n -> n % 2 == 0;
        // List<Integer> pares = filtrar(numeros, apenasPares);
    }
    
    // TODO: Crie o método genérico filtrar(List<T>, Filtro<T>)
}
