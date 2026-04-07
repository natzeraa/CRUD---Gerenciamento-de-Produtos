import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produtos produto = new Produtos();

        boolean continuarRodando = true;

        do{
            System.out.println("Menu");
            System.out.println("[3] - ATUALIZAR PRODUTO");
            System.out.println("4 - Deletar");
            System.out.println("[0] - SAIR DO PROGRAMA");

            System.out.println("Informe uma opcao do menu: ");
            int opcaoUsuario = sc.nextInt();

            switch(opcaoUsuario){
                case 3 :
                    // produto.ListarProdutos();
                    System.out.println("Qual produto deseja atualizar, digite abaixo::");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o novo nome do livro:  ");
                    String novoNome = sc.nextLine();

                    produto.Atualizar(indice -1, novoNome);
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
