import java.util.ArrayList;
import java.util.List;

public class Gerenciador {

    private List<Produto> produtos;
    private List<Lista> lista; 

    public Gerenciador () {
        this.produtos = new ArrayList<>();
        this.lista = new ArrayList<>();
    }
    
    public String cadastrarProduto (String nome, double valor, double peso) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return "Produto já cadastrado";
            }
        }

        Produto produto = new Produto (nome, valor, peso);
        produtos.add(produto);
        return "Cadastrado";
    }

    public String listarProdutos () {
        String listaString = " ";
        for ( Produto : produtos ) {
        Object produto;
            listaString += produto.toString() + "\n";
        }

        return listaString;
    }

    public String criarLista () {
        for (Lista lista : Lista) {
            if (lista.getName().equals(lista)) {
                return "Esta lista já existe";
            }     
        }

        Lista lista = new Lista(nome);
        lista.add(lista);
        return "Lista criada !!";
    }

    public String adicionarProduto (String nomeProduto, String nomeLista) {
        Produto produto = null;
        for (Produto p : produto) {
            if (p.getName().equals(nomeProduto)) {
                produto = p;
                break;
            }
        }

        if (produto == null) {
            return "O produto não foi encontrado";
        }

        if (lista == null) {
            return "A lista não foi encontrada";
        }

        ((Lista) lista).adicionarProduto(produto);
        return "Produto adicionado a lisa";
    }

    public String detalhesLista (String nome) {
        Lista lista = null;
        for (Lista lista : lista ) {
            if(lista.getNome().equals(nome)) {
                lista = lista;
            }
            
        }

        //travei
        
    }
}
