public class Produto {
    private String nome;
    private double valor;
    private double peso;

//

public Produto (String nome, double valor, double peso ) {
    this.nome = nome;
    this.valor = valor;
    this.peso = peso;
}

public String getName() {
    return nome; 
}

public double getValor() {
    return valor; 
}

public double getPeso() {
    return peso; 
}

public String toString() {
    return "Nome: " + nome + "Valor: " + valor + "Peso: " + peso; 
}

}
