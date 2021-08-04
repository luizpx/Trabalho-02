public class Compra extends Transacao{

    private float precoUnit;

    public Compra(String nome, int qtdeEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo, String dataTransacao, int qtde, float precoUnit1) {
        super(nome, qtdeEstoque, precoUnit, estoqueMinimo, estoqueMaximo, dataTransacao, qtde);
        this.precoUnit = precoUnit1;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }



    public boolean comprar(int quantidade){
        if(verificaEstoqueExcedente(quantidade) == true){
            System.out.println("Produto sem estoque.");
            return false;
        }
        else{
            creditarEstoque(quantidade);
            return true;
        }

    }


}
