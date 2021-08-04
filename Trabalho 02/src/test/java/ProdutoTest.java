import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarIgualExemplo() {

        Cliente cliente1 = new Cliente("Marco", "123");
        Produto produto1 = new Produto("Caneta", 100, 1.2f, 10, 200);
        Fornecedor fornecedor1 = new Fornecedor("Antonio","456");
        produto1.venderProduto("26/07/2021", cliente1, 95);


    }

}