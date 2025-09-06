import java.util.Scanner;

public class ex04Revisao {
    public static Scanner input = new Scanner(System.in);
    public static final int tamanhoVetor = 5;
    public static void main(String[] args) {

        int[] v1 = new int[tamanhoVetor];
        int[] v2 = new int[tamanhoVetor];
        int[] resultado = new int[tamanhoVetor];
        System.out.println("Digite o valor do 1° vetor:");
        pegarValores(v1);
        System.out.println("Digite o valor do 2° vetor:");
        pegarValores(v2);
        somarVetores(resultado, v1, v2);
        System.out.print("resultado = ");
        mostrarValores(resultado);
        System.out.print("v1 = ");
        mostrarValores(v1);
        System.out.print("v2 = ");
        mostrarValores(v2);
    }


    public static void pegarValores(int[] v) {
        for(int i = 0; i < v.length; i++) {
            System.out.print("digite o " + (1+i) + "° número do vetor: ");
            v[i] = input.nextInt();
        }
    }

    public static void somarVetores(int[] resultado, int[] v1, int[] v2) {
        for(int i = 0; i < resultado.length; i++) {
            resultado[i] = v1[i] + v2[i];
        }
    }

    public static void mostrarValores(int[] v) {
        System.out.print("{");
        if (v.length > 0) {
            System.out.print(" " + v[0]);
        }
        for(int i = 1; i < v.length; i++) {
            System.out.print(", " + v[i]);
        }
        System.out.print("}");
    }
}