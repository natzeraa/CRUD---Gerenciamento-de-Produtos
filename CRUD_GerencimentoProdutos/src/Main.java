import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();

        boolean continuarRodando = true;

        do {
            System.out.println("Bem vindo ao sistema de gerenciamento de Produtos: ");
            System.out.println("[2] - LISTAR PRODUTOS");
            System.out.println("[0] - SAIR DO PROGRAMA");

            System.out.println("Informe uma opcao do menu: ");
            int opcaoUsuario = sc.nextInt();
            switch (opcaoUsuario){

            case 2:
                sc.nextLine();
                System.out.println("PRODUTOS LISTADOS ABAIXO:  ");
                System.out.println();
                produtos.ListaProdutos();
                break;


            case 0:

                continuarRodando = false;

                System.out.println("Programa finalizado. Obrigado por Utilizar.");
            }

    } while (continuarRodando);
    }
}
