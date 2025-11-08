import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Produtos[] p = new Produtos[5];

        for(int i = 1; i <= p.length; i++) {
            System.out.println("Digite o produto " + i);
            p[i] = new Produtos();
            receberValor(p[i]);
        }

        for(int i = 0; i < p.length; i++) {
            System.out.println("Produto " + (i + 1));
            
        }


    }

    public static void receberValor(Produtos p) {
        System.out.print("Digite o título do produto: ");
        p.titulo = input.nextLine();
        System.out.print("Digite a descrição do produto: ");
        p.descricao = input.nextLine();
        System.out.print("Digite o preço do produto: ");
        p.preco = input.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        p.qtdEstoque = input.nextInt();
        input.nextLine();
    }

    public static void imprimirValor(Produtos p) {
        System.out.println("Título: " + p.titulo);
        System.out.println("Descrição: " + p.descricao);
        System.out.println("Preço:" + p.preco);
        System.out.println("Quantidade em estoque: " + p.qtdEstoque);
    }
}
