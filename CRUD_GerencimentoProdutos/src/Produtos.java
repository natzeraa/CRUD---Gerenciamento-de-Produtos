public class Produtos {

    public void deletar(int index) {
        if (index >= 0 && index < produtos.size()) {
            produtos.remove(index);
            System.out.println("Produto removido!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

}
