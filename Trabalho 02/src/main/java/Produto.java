import java.util.ArrayList;
import java.util.List;

public class Produto{

    private String nomeProduto;
    private int qtdeEstoque;
    private float precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private List<String> historico = new ArrayList();

    public Produto(String nome, int qtdeEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo) {
        this.nomeProduto = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }


    public List getHistorico() {
        return historico;
    }

    public void setHistorico(List historico) {
        this.historico = historico;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nome) {
        this.nomeProduto = nome;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }



    public void debitarEstoque(int quantidade){
        qtdeEstoque = qtdeEstoque - quantidade;
    }

    public void creditarEstoque(int quantidade){
        qtdeEstoque = qtdeEstoque + quantidade;
    }

    public boolean verificarEstoqueBaixo(){
        if(getEstoqueMinimo() > qtdeEstoque)
            return true;
        else
            return false;
    }

    public boolean verificaEstoqueInsuficiente(int quantidade){
        if(quantidade > qtdeEstoque)
            return true;
        else
            return false;
    }

    public boolean verificaEstoqueExcedente(int quantidade){
        if((quantidade + qtdeEstoque) > getEstoqueMaximo())
            return true;
        else
            return false;
    }

    public float calcularValorVenda(int quantidade){
        return ((int)(precoUnit * quantidade));
    }

    public void venderProduto(String dataCompra, Cliente cliente, int quantidade){
        Venda venda = new Venda(nomeProduto, getQtdeEstoque(), precoUnit, getEstoqueMinimo(), getEstoqueMaximo(), dataCompra, quantidade);
        venda.vender();

    }


    public void comprarProduto(String dataCompra, Fornecedor fornecedor, int quantidade, float preco){
        Compra compra = new Compra(getNomeProduto(), getQtdeEstoque(), getPrecoUnit(), getEstoqueMinimo(), getEstoqueMaximo(), dataCompra, quantidade, preco);
        if(compra.comprar(quantidade) == true){
            this.historico.add(getNomeProduto());
        }
    }


}
