import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produtos produto = new Produtos();

        boolean continuarRodando = true;

        do {
            System.out.println("Bem vindo ao sistema de gerenciamento de Produtos! ");
            System.out.println("[1] - CADASTRAR PRODUTO");
            System.out.println("[2] - LISTAR PRODUTOS");
            System.out.println("[3] - ATUALIZAR PRODUTO");
            System.out.println("[4] - DELETAR");
            System.out.println("[0] - SAIR DO PROGRAMA");

            System.out.println("Informe uma opcao do menu: ");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    sc.nextLine();
                    System.out.println("Bem vindo ao cadastro de Produtos!");
                    System.out.print("Informe o nome do Produto: ");
                    String nomeProduto = sc.nextLine();

                    gProdutos.CadastrarProduto(nomeProduto);
                    break;
            }
                case 2:
                    sc.nextLine();
                    System.out.println("PRODUTOS LISTADOS ABAIXO:  ");
                    System.out.println();
                    produto.ListaProdutos();
                    break;
                case 3:
                    // produto.ListarProdutos();
                    System.out.println("Qual produto deseja atualizar, digite abaixo::");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o novo nome do livro:  ");
                    String novoNome = sc.nextLine();

                    produto.Atualizar(indice - 1, novoNome);
                    break;
                case 4:
                    System.out.println("Digite o indice do produto: ");
                    int index = sc.nextInt();
                    produto.deletar(index);

                case 0:
                    continuarRodando = false;
                    System.out.println("Programa finalizado. Obrigado por Utilizar.");
            }
        } while (continuarRodando);
    }
}
