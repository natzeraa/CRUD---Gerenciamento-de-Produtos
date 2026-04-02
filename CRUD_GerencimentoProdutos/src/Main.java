import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("4 - Deletar");
            System.out.println("0 - Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 4:
                    System.out.println("Digite o indice do produto: ");
                    int index = input.nextInt();
                    produto.deletar(index);
                case 0
                    ;
                    System.out.println("Saindo, valeu ....");
                    break;
                default:
                    System.out.println("Opcao invalida! ");

            }
        }while (opcao != 0);

        input.close();
        
    }
}
