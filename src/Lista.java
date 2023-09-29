import java.util.ArrayList;
import java.util.List;

public class Lista {
    private String nome;
    private List<Produto> produtos;

    public Lista (String nome) {
        this.nome = nome; 
        this.produtos = new ArrayList<>();
    }

    public String getName() {
        return nome;
    }
}

public List<Produto> getProdutos () {
    return produtos;
}

public void adicionarProduto (Produto produto) {
    produtos.add(produtos);

}

public void removerProdutos (Produto produto) {
    produtos.remove(produtos);
}

public double calcularValorTotal () {
    double total = 0;

    for (Produto produto : produtos) {
        total+= produto.getValor();
    }

    return total;
}

public double calcularValorPeso () {
    double total = 0; 

    for (Produto produto : produtos) {
        total+= produto.getValor();
    }

    return total; 
}

public String toString { 
    String result = "Lista: " + nome "\n";
    for (Produto : produto) {
        result += produto topString() + "\n";
    }

    result += "Valor total: " + calcularValorTotal() + "\n";
    result += "Peso total: " + calcularValorPeso() + "\n";
    return result;

}

    public void add(Lista lista) {
    }


//arrumar



