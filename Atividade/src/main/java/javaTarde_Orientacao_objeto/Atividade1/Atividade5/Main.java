package javaTarde_Orientacao_objeto.Atividade1.Atividade5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        contaBancaria seuBanco = new contaBancaria();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do titular");
        seuBanco.titular= sc.nextLine();
        System.out.println("Digite seu saldo");
        seuBanco.saldo = sc.nextDouble();
        System.out.println("Digite (1) para depositar");
        System.out.println("Digite (2) para sacar");
        seuBanco.opcao = sc.nextInt();

        System.out.println("O seu saldo agora e:" +seuBanco.transferencia());

    }
}
