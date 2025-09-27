public class selectionSort {
    public static void main(String[] args) {
        
    }

    public static void selectionSort(int[] v, int tam) {
        int posMenor, aux;
        for(int i = 0; i < tam - 2; i++) {
            posMenor = i;
            for(int j = i + 1; j <= tam; j ++) {
                if (v[j] < posMenor) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                aux = v[i];
                v[i] = v[posMenor];
                v[posMenor] = aux;
            }
        }
    }
}