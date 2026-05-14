package javaTarde_Orientacao_objeto.Atividade1.Atividade8;
import java.util.Scanner;
public class Main {
    static void main() {
        Funcionario f1 = new Funcionario("Gabriel","Silva", 2000.00);
        f1.darAumento(10);
        System.out.println("Novo salario anual: R$" + f1.salarioMensal());

    }

}
