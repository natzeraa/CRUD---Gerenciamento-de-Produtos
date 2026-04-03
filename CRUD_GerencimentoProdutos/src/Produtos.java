import java.util.ArrayList;

public class Produtos{
    ArrayList<String> produtos = new ArrayList<>();

    public void ListaProdutos() {
            System.out.println("Lista");

        for (int i = 0; i <produtos.size(); i++){
            System.out.println((i + 1) + ". " + produtos.get(i));
        }

}
}