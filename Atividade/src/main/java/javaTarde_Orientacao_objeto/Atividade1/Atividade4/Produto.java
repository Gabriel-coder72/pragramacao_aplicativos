package javaTarde_Orientacao_objeto.Atividade1.Atividade4;

public class Produto {
        String nome;
        double preco;
        int quantidadeEstoque;

        void exibirResumo() {
            double valorTotal = preco * quantidadeEstoque;

            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Quantidade em estoque: " + quantidadeEstoque);
            System.out.println("Valor total em estoque: R$ " + valorTotal);
        }
    }

