package Agendamento_medico1;

public class Paciente {
    public String nome;
    public String cpf;
    public String especialidade;
    public int cadastro;
    public int opcaoHorario;

    public void exibirDados(){
        System.out.println("Nome:" + nome);
        System.out.println("cpf:" + cpf);
        System.out.println("especialidade:" + especialidade);
        System.out.println("cadastro" + cadastro);
        System.out.println("opcaoHorario" + opcaoHorario);
    }
}
