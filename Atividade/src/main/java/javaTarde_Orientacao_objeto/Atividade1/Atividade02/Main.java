package javaTarde_Orientacao_objeto.Atividade1.Atividade02;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        System.out.println("Digite o nome do primeiro cachorro: ");
        cachorro1.nome = sc.nextLine();

         System.out.println("Digite a raça do primeiro cachorro: ");
        cachorro1.raca = sc.nextLine();

         System.out.println("Digite a idade do primeiro cachorro: ");
        cachorro1.idade = sc.nextInt();

          System.out.println("Digite o nome do segundo cachorro: ");
        cachorro2.nome = sc.nextLine();

         System.out.println("Digite a raça do segundo cachorro: ");
        cachorro2.raca = sc.nextLine();

        System.out.println("Digite a idade do segundo cachorro: ");
        cachorro2.idade = sc.nextInt();


        System.out.println();

        cachorro1.latir();
        cachorro2.latir();

        sc.close();
    }
}
