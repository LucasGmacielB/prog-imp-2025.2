import java.util.Scanner;
public class Exemplo02 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int x;

        do {
            System.out.println("");
            System.out.println("Digite 1 para listar todos os números de 1 a 100");
            System.out.println("Digite 2 para listar todos os números pares entre 1 e 100");
            System.out.println("Digite 3 para listar todos  os números ímpares entre 1 e 100");
            System.out.println("Digite 4 para listar todos os multiplos de 3 entre 1 e 100");
            System.out.println("Digite 5 para listar todos os números que são multiplos de 3 e que terminam com entre 1 e 100");
            System.out.println("Digite 0 para sair");

            x = scan.nextInt();

            switch (x) {
                case 1:
                    for (int i = 0; i <= 100; i++) {
                        System.out.print(i + ", ");
                    }
                    break;
                
                case 2:
                    for (int i = 1; i <= 100; i = i + 2){
                        System.out.print(i + ", ");
                    }
                    break;

                case 3:
                    for (int i = 2; i <= 100; i += 2){
                        System.out.print(i + ", ");
                    }
                    break;

                case 4:
                    for (int i = 3; i <= 100; i += 3){
                        System.out.print(i + ", ");
                    }
                    break;

                case 5:
                    for (int i = 3; i <= 100; i++) {
                        if (i % 3 == 0 || i % 10 == 3) {
                            System.out.print(i + ", ");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Obrigado por usar o programa :)");
                    break;
            
                default:
                    System.out.println("Opção inválida, tente nvamente");
                    break;
            }
        } while (x != 0);
    }
}