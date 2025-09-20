package atividadeConjuntos;

import java.util.Scanner;

public class Conjuntos {
    public static Scanner input = new Scanner(System.in);
    static final int vm = 30;
    static int[] conjuntoA = new int[vm];
    static int[] conjuntoB = new int[vm];
    public static void main(String[] args) {
        
    }

    public static void imprimirMenu() {
        int escolha;
        int valor;
        int tamanho;
        do{
        System.out.println("Escolha uma das opções abaixo.");
        System.out.println("1. Inserir 1 elemento no Conjunto A");
        System.out.println("2. Inserir 1 elemento no Conjunto B");
        System.out.println("3. Imprimir os Conjuntos A e B");
        System.out.println("4. Gerar e Imprimir a união de A e B");
        System.out.println("5. Gerar e Imprimir a interseção entre A e B");
        System.out.println("6. Gerar e Imprimir a diferença entre A e B");
        System.out.println("7. Gerar e Imprimir a diferença entre B e A");
        System.out.println("0. Sair do sistema");
        escolha = input.nextInt();

        switch (escolha) {
            case 0:
                System.out.println("Obrigado por usar o sistema");
                break;
            case 1:
                System.out.print("Digite o valor que deseja adicionar ao conjunto A: ");
                valor = input.nextInt();
                System.out.print("Digite o valor que deseja adicionar ao conjunto A: ");
                tamanho = input.nextInt();
                inserirValorConjunto(conjuntoA, tamanho, valor);

                break;
            case 2:
                System.out.println("escolha 2");
                break;
            case 3:
                System.out.println("escolha 3");
                break;
            case 4:
                System.out.println("escolha 4");
                break;
            case 5:
                System.out.println("escolha 5");
                break;
             case 6:
                System.out.println("escolha 6");
                break;
             case 7:
                System.out.println("escolha 7");
                break;
        
            default:
                System.out.println("Você digitou uma opção inválida, digite uma opção válida!");
                break;
        }
        } while(escolha != 0);
    }

    public static int buscaSequencial(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    
    //terminar essa parte - adicionar elementos
    public static void inserirValorConjunto(int[] v, int tam, int valor) {
        if(buscaSequencial(v, tam, valor) != -1) {
            System.out.println("Você digitou um número repetido");
        }
    }
}
