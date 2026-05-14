package Controle_estoque;

public class Produto {
    public String nome;
    public double preco;
    public double quantidade;

    public double ValortotalemStock() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;

    }

    public void removeerProdutos(int quantidade) {
        this.quantidade -= quantidade;


    }

    public String toString() {
        return nome
                + ", R$ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$"
                + String.format("%.2f", ValortotalemStock());

    }
}

