package javaTarde_Orientacao_objeto.Atividade1.Atividade7;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        carro carro = new carro();
        System.out.println("Digite o modelo do carro");
        carro.modelo = entrada.nextLine();
        System.out.println("Digite a marca do carro");
        carro.marca = entrada.nextLine();
        System.out.println("Digite a velocidade que esta pilotando");
        carro.velocidadeAtual = entrada.nextInt();

        System.out.println("voce ira acelerar ou freiar?");
        System.out.println("(1) Acelerar");
        System.out.println("(2) Freiar");
        int opcao = entrada.nextInt();
        if (opcao == 1) {
            carro.acelerar();
        }else if (opcao == 2){
            carro.frear();
        }
    }
}
