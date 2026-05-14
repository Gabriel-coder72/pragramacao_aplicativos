package javaTarde_Orientacao_objeto.Atividade1.Atividade6;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        a1.nome = "Gabriel";
        a1.matricula = 792;

        a1.nota1 =10;
        a1.nota2 =7;
        a1.nota3 =2;
        System.out.println("nome: " + a1.nome);
        System.out.println("Media: "+       a1.matricula);

        a1.verificarSituacao();
    }
}
