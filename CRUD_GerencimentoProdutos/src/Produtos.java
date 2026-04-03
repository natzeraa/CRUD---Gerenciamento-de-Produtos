import java.util.ArrayList;

public class Produtos {

    ArrayList<String> listaProdutos = new ArrayList<>();

    public void CadastrarProduto(String nomeLivro){
        try {
            listaProdutos.add(nomeLivro);
            System.out.printf("O Produto %s foi cadastrado com sucesso!\n", nomeLivro);
        } catch (Exception error) {
            System.out.println("Erro ao cadastrar produto: " + error);
        }

    }
}

