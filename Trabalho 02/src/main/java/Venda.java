public class Venda extends Transacao {

    public Venda(String nome, int qtdeEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo, String dataTransacao, int qtde) {
        super(nome, qtdeEstoque, precoUnit, estoqueMinimo, estoqueMaximo, dataTransacao, qtde);
    }

    public boolean vender() {
        if (verificaEstoqueInsuficiente(getQtde()) == true) {
            System.out.println("Quantidade em estoque insuficiente.");
            return false;
        } else {
            debitarEstoque(getQtde());
            System.out.println(calcularValorVenda(getQtde()));
            if (verificarEstoqueBaixo() == true){
                System.out.println("Estoque baixo");
            }
            return true;
        }

    }
}

