public class Transacao extends Produto{

    private String dataTransacao;
    private int qtde;

    public Transacao(String nome, int qtdeEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo, String dataTransacao, int qtde) {
        super(nome, qtdeEstoque, precoUnit, estoqueMinimo, estoqueMaximo);
        this.dataTransacao = dataTransacao;
        this.qtde = qtde;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }


}

