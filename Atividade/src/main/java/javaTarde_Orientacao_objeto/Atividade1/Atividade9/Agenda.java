package javaTarde_Orientacao_objeto.Atividade1.Atividade9;

import java.util.Scanner;

public class Agenda {
    public Contato [] contato = new Contato[5];

    public void listarContatos(){
        for (int i=0; i < contato.length; i++){
            if (contato [i] != null){
                System.out.println(contato[i].nome);
            }
        }
    }
}



