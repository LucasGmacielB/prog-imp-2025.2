import java.util.Scanner;
public class Ex01 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        int[] a = {1, 0, 5, -2, -5, 7};
        int soma = a[0] + a[1] + a[5];
        a[3] = 100;
        System.out.print("{");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i + 1 < a.length) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}