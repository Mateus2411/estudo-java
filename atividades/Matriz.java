package atividades;

import java.util.ArrayList;

public class Matriz {
    public static void main(String[] args) {
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
        for (int i = 1; i < matrizi.size(); i++) {
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
