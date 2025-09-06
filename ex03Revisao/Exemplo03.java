package ex03Revisao;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        final int QTD = 4;
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[QTD];
        int soma; 
        double media;

        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[1] = input.nextInt();
            soma += numeros[i];
        }

        
    }
}