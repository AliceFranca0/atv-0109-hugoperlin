import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Pessoa> pessoas;

    public Banco() {
        pessoas = new ArrayList<>();
    }

    public boolean cadastrarPessoa(String nome, String cpf, String email, String telefone) {
        // Verifa se a pessoa já possui cpf 
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("Esse CPF já possui cadastro");
                 return false;                
            }
        }

        // Caso não exista cadastro, ele vai cadastrar   
        Pessoa novaPessoa = new Pessoa(nome, cpf, email, telefone);
        pessoas.add(novaPessoa);
        return true;
    }

    public boolean cadastrarContaBancaria(int numero, int agencia, String nome, String cpf, String senha) {
        // Devereia verifar se já exite conta no vetor
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero && conta.getAgencia() == agencia) {
                System.out.println("Já existe uma conta com esses dados");
                return false;
            }
        }

        // Verificar se existe uma pessoa com o CPF informado no vetor de pessoas
        Pessoa pessoaDonoConta = null;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoaDonoConta = pessoa;
                break;
            }
        }

        if (pessoaDonoConta != null) {
            // Se o cpf existir, criar conta
            ContaBancaria novaConta = new ContaBancaria(numero, agencia, nome, cpf, senha);
            contas.add(novaConta);
            return true;
        } else {
            System.out.println("Não existe ");
            return false; 
        }
    }
}



