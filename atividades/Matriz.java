package atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TolsMatriz tolsMatriz = new TolsMatriz();
        tolsMatriz.criarMatriz();
        sc.close();
    }
}

class TolsMatriz {

    public ArrayList<Integer> montarMatriz(String line) {
        ArrayList<Integer> nuns = new ArrayList<>();

        int[] nums = Arrays.stream(line.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int elem : nums) {
            nuns.add(elem);
        }
        return nuns;
    }
    
    public void criarMatriz() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o numero da matriz sendo\nprimeiro linha e depois coluna, utilize ',' para separar");
        String tamanho;

        int erros = 0;
        do {
            if (erros > 0) {
                System.out.println("Digite o numero novamente seguindo as instruções dadas");
            }
            tamanho = sc.nextLine();
            erros++;
        } while (!tamanho.trim().matches("-?\\d+,-?\\d+"));

        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<Integer> linhasEcolunas = new ArrayList<>();

        String[] extractedNums = tamanho.split(",");

        for (int i = 0; i < extractedNums.length; i++) {
            linhasEcolunas.add(Integer.parseInt(extractedNums[i]));
        };

        for (int i = 0; i < linhasEcolunas.get(0); i++) {
            System.out.printf("Digite os numeros da %dª linha da matriz separados por espaço\n", i + 1);
            String nuns;

            //Limpa o Buffer
            int loads = 0;
            do {
                if (loads != 0) {
                    System.out.printf("Digite novamente os numeros");
                }
                nuns = sc.nextLine();
            } while (nuns.trim().split("\\s+").length != linhasEcolunas.get(1));
            ArrayList<Integer> line = montarMatriz(nuns);
            matriz.add(line);
        };
        sc.close();
        imprimirMatrizComBorda(matriz);
    }

    //Chatzão kkkkkkkkkkkk
    public void imprimirMatrizComBorda(ArrayList<ArrayList<Integer>> matriz) {

        System.out.println("Matriz");
        int colunas = matriz.get(0).size();

        // encontra maior número pra ajustar largura automaticamente
        int max = Integer.MIN_VALUE;

        for (ArrayList<Integer> linha : matriz) {
            for (int v : linha) {
                max = Math.max(max, v);
            }
        }

        int largura = String.valueOf(max).length() + 2;

        // topo
        printLinha(colunas, largura);

        for (ArrayList<Integer> linha : matriz) {

            System.out.print("|");

            for (int v : linha) {
                System.out.printf("%" + largura + "d|", v);
            }

            System.out.println();

            printLinha(colunas, largura);
        }
    }

    private void printLinha(int colunas, int largura) {
        System.out.print("+");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();
    }

    // Operações com matriz
    public void MatrizTransposta() {
        ArrayList<ArrayList<Integer>> matrizi = new ArrayList<>();

        ArrayList<Integer> line1 = new ArrayList<>();
        line1.add(1);
        line1.add(2);
        ArrayList<Integer> line2 = new ArrayList<>();
        line2.add(3);
        line2.add(4);
        ArrayList<Integer> line3 = new ArrayList<>();
        line3.add(5);
        line3.add(6);

        matrizi.add(line1);
        matrizi.add(line2);
        matrizi.add(line3);

        ArrayList<ArrayList<Integer>> matrizf = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();

        int rolets = 0;
        for (int i = 0; i < matrizi.size(); i++) {
            for (int j = 0; j < matrizi.size(); j++) {
                nums.add(matrizi.get(j).get(rolets));
                if (j == 2) {
                    rolets += 1;
                }
            }

            matrizf.add(new ArrayList<>(nums));
            if (i == 1) {
                nums.clear();
            }
        }
        for (int i = 0; i < matrizf.size(); i++) {
            int j = 0;
            System.out.printf("%d %d %d\n", matrizf.get(i).get(j), matrizf.get(i).get(++j), matrizf.get(i).get(++j));
        }
    }

}
