package Agendamento_medico1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String cpf;
        String especialidade;
        int cadastro;
        int opcaoHorario;

        System.out.print("Voce possui cadastro?");
        System.out.println("1-Sim");
        System.out.println("2-Nao");
        cadastro = sc.nextInt();

        if(cadastro==2) {
            System.out.println("Paciente nao cadastrado");
            System.out.println("Sistema encerrado");

        }else{
            Paciente paciente = new Paciente();

            sc.nextLine();

            System.out.println("Digite o nome do Paciente:");
            paciente.nome = sc.nextLine();

            System.out.println("Digite o cpf do Paciente:");
            paciente.cpf = sc.nextLine();

            System.out.println("Nome: " + paciente.nome);
            System.out.println("Cpf: " + paciente.cpf);

            System.out.println("Paciente cadastrado!");


            System.out.println("\nespecialidadeDisponiveis:");
            System.out.println(" 1- Clinico Geral");
            System.out.println("2- Dermatologista");
            System.out.println("3- Cardiologista");

            System.out.println("Escolha uma opcao");
            int opcao = sc.nextInt();

            Paciente Paciente = new Paciente();

             if (opcao==1) {
                 paciente.especialidade = "Clinico Geral";

             } else if (opcao==2) {
                 paciente.especialidade = "Dermatologista";

             }else if (opcao==3) {
                 paciente.especialidade = "Cardiologista";

             }else{
                 paciente.especialidade = "Opcao invalida";

             }

            System.out.println("\nHorariosDisponiveis:");
            System.out.println(" 1- 16:00");
            System.out.println(" 2- 17:00");
            System.out.println("3- 15:00");
            System.out.println(" 4- 12:00");
            System.out.print("Escolha um Horario");
            opcaoHorario = sc.nextInt();
             if(opcaoHorario==1) {
                 System.out.println("O Horio escolhido e 16:00");
             }else if (opcao==2) {
                 System.out.println("O Horario escolhido e 17:00");
             }else if (opcao==3) {
                 System.out.println("O Horario escolhido e 15:00");
             }else if (opcao==4) {
                 System.out.println("O Horario escolhido e 12:00");
             }else{
                 System.out.println("Horario Invalido");
             }
            System.out.println();
             paciente.exibirDados();
            System.out.println("\n Agendamento Finalizado");
        }
         sc.close();


    }
}
