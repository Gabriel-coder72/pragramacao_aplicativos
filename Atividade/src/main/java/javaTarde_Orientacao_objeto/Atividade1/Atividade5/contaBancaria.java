package javaTarde_Orientacao_objeto.Atividade1.Atividade5;

import java.util.Scanner;

public class contaBancaria {
public double saldo;
public String titular;
public int opcao;
public double quantDepositar;
public double quantSacar;

public double transferencia () {
    Scanner sc = new Scanner(System.in);
    if (opcao == 1) {
    System.out.println("Digite quanto voce quer depositar");
    quantDepositar = sc.nextDouble();
    saldo = saldo + quantDepositar;
    return saldo;
   } else if (opcao == 2) {
        System.out.println("Digite quanto voce quer sacar");
        quantSacar = sc.nextDouble();
        if (quantSacar > saldo) {
            System.out.println("Voce nao tem dinheiro");
            return saldo;
        } else {
            saldo = saldo - quantSacar;
            System.out.println("Voce sacou");
            return saldo;

        }
    }
    return saldo;

}
}
