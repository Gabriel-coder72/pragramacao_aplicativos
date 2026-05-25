package Compra_online1;

public class Usuario {
        public String nome;
        public String cpf;
        public String endereco;
        public String formaPagamento;

        public void exibirDados() {

            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Endereco: " + endereco);
            System.out.println("Forma de pagamento: " + formaPagamento);
        }
    }

