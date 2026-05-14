package javaTarde_Orientacao_objeto.Atividade1.Atividade9;

public class Main {
     public static void main(String[] args) {
     Agenda agenda1 = new Agenda();
     agenda1.contato[0] = new Contato("Joao", "22222-1111");
     agenda1.contato[1] = new Contato("Carlos", "33333-2324");
     agenda1.contato[2]  = new Contato("Mario", "55555-9999");
     agenda1.listarContatos();
    }
}
