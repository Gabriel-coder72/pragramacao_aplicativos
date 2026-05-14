package javaTarde_Orientacao_objeto.Atividade1.Atividade8;

public class Funcionario {
    String nome;
    String sobrenome;
    double salarioMensal;

    Funcionario(String n, String s, double salario) {
        nome = n;
        sobrenome = s;
        salarioMensal = salario;
    }

    double darAumento (double porcentagem) {
        salarioMensal += salarioMensal * porcentagem / 100;
        return salarioMensal;
    }
    double salarioMensal () {
      return salarioMensal * 12;

    }
}
