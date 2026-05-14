package javaTarde_Orientacao_objeto.Atividade1.Atividade3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor da base");
        double valorBase = sc.nextDouble();
        System.out.println("digite o valor da altura");
        double valorAltura = sc.nextDouble();

        double resultado = valorBase * valorAltura;
        System.out.printf("O resultado e" + resultado);
    }
}
