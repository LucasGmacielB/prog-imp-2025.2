package ordemVetor;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = {1, 5, -2, 5, 50, 10, 20, 0};

        int[] vetor2 = {1, 1, 1, 2, 3, 5, 5, 5, 10, 15, 15, 15};
        buscaValoresRepetidosVetor(vetor2, 12);
    }

    public static void insertionSort(int[] v, int tam) {
        System.out.print("{");
        for(int i = 1; i < tam; i++) { //Começa em 1 pois o loop já irá iniciar na segunda posição do vetor

            int key = v[i]; //Guardando o valor do vetor

            int j = i - 1; //Guardando a posição do vetor, em uma posição a menos, por isso o -1

            while (j >= 0 && key < v[j]) { // Condições: A posição do vetor não pode ser maior ou igual a 0 && O valor que foi guardado na var "key" tem q ser menor do que o valor que está na "j" do vetor(sempre uma posição a menos, ou seja, a posição "j" sempre estará olhando para a posição anterior a "i")

                v[j + 1] = v[j]; //Se as condições forem cumpridas as posições serão trocadas(EX: o valor 5 que esta na posição 8 vai trocar de lugar com o valor 20 que está na posição 7)

                j--;
            }
            v[j + 1] = key; //Adiciona o valor guardado na var "key" na posição "j + 1"(uma posição a frente)
        }
        for(int i = 0; i < tam; i++) {
                System.out.print(v[i]);
                if(i < tam - 1) {
                    System.out.print(", ");
                }
            }
        System.out.print("}");
    }
    public static void buscaValoresRepetidosVetor(int[] v, int tam) {
        int qtd = 1;
        for(int i = 1; i < tam; i++) {
            if (v[i] != v[i - 1]) {
                System.out.println(v[i - 1]  + "|" + qtd);
                qtd = 1;
            } else {
                qtd++;
            }
        }
        System.out.println(v[tam - 1] + "|" + qtd);
    }
}
