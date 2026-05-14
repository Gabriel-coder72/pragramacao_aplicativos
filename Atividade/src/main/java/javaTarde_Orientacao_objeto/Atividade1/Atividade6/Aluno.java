package javaTarde_Orientacao_objeto.Atividade1.Atividade6;

public class Aluno {
    String nome;
    int matricula;
    double nota1, nota2, nota3;
    double calcularMedia () {
        return (nota1 + nota2 + nota3) / 3;
    }
    void verificarSituacao () {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Voce foi aprovado");
        }else{
            System.out.println("Voce foi reprovado");
        }
    }
}
