import java.util.ArrayList;

public class Produtos {

    ArrayList<String> produtos = new ArrayList<>();

    public void CadastrarProduto(String nomeLivro){
        try {
            produtos.add(nomeLivro);
            System.out.printf("O Produto %s foi cadastrado com sucesso!\n", nomeLivro);
        } catch (Exception error) {
            System.out.println("Erro ao cadastrar produto: " + error);
        }

    }

    public void ListaProdutos() {
        System.out.println("Lista");

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + ". " + produtos.get(i));
        }
    }

    public void Atualizar(int posicao, String novoNome) {

        if (posicao < 0 || posicao >= produtos.size()) {
            System.out.println("Indice inválido");
        }

        String valorAntigo = produtos.get(posicao);

        produtos.set(posicao, novoNome);

        System.out.printf("Prodeuto '%s' atualizado para '%s' :", valorAntigo, novoNome);
    }

    public void deletar(int index) {
        if (index >= 0 && index < produtos.size()) {
            produtos.remove(index);
            System.out.println("Produto removido!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}