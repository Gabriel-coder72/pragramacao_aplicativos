package javaTarde_Orientacao_objeto.Atividade1.Atividade7;

public class carro {
    String modelo;
    String marca;
    int velocidadeAtual = 0;
    int opcao;

    void acelerar () {
        velocidadeAtual += 10;
        System.out.println("Velocidade atual:" + velocidadeAtual + "km/h");
    }
    void frear () {
        if (velocidadeAtual >0)
            velocidadeAtual -= 10;
        System.out.println("velocidade:" + velocidadeAtual + "Km/h");
    }
}
