import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produtos gProdutos = new Produtos();
        boolean continuarRodando = true;
        do {
            System.out.println("Bem vindo ao sistema de gerenciamento de Produtos! ");
            System.out.println("[1] - Cadastrar Produto");

            System.out.println("Informe uma opção do menu:");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario){
                case 1:
                    sc.nextLine();
                    System.out.println("Bem vindo ao cadastro de Produtos!");
                    System.out.print("Informe o nome do Produto: ");
                    String nomeProduto = sc.nextLine();

                    gProdutos.CadastrarProduto(nomeProduto);
                    break;
            }

        }while (continuarRodando);
        sc.close();
    }
}

