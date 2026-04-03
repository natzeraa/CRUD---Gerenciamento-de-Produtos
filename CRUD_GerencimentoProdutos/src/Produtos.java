import java.util.ArrayList;

public class Produtos {

    ArrayList<String> produtos = new ArrayList<>();

    public void Atualizar (int posicao, String novoNome) {

        if(posicao < 0 || posicao >= produtos.size()){
            System.out.println("Indice inválido");
        }

        String valorAntigo = produtos.get(posicao);

        produtos.set(posicao, novoNome);

        System.out.printf("Prodeuto '%s' atualizado para '%s' :", valorAntigo, novoNome);
    }
}
