package atividades;

import java.util.Scanner;

public class Calular {

    static int calc(int op, int num1, int num2) {
        int result = 0;
        if(num1 == 0 || num2 == 0 && op == 3){
            System.out.println("Nao pode dividir por 0");
            return 0;
        }
        switch (op) {
            case 1 ->
                result = num1 + num2;
            case 2 ->
                result = num1 - num2;
            case 3 ->
                result = num1 / num2;
            case 4 ->
                result = num1 * num2;
            default ->
                System.out.println("Digite valores válidos");
        }
        return result;
    }

    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(System.in);) {
            System.out.println("numero 1");
            int num1 = sc.nextInt();
            System.out.println("numero 2");
            int num2 = sc.nextInt();
            System.out.println("Select a number:");

            String[] metods = {"Sum", "Subtraction", "Division", "Multiplication"};
            for (int i = 0; i < 4; i++) {
                System.out.printf("%d - %s \n", i + 1, metods[i]);
            }
            int op = sc.nextInt();

            int result = calc(op, num1, num2);
            System.out.printf("Result: %d", result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
        }

    }
}
