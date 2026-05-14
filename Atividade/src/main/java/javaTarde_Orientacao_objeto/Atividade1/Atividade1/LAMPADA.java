package javaTarde_Orientacao_objeto.Atividade1.Atividade1;

public class LAMPADA {
    private  boolean ligada;
    public void ligar(){
        ligada = true;
    }
    public void desligada(){
        ligada = false;
    }
    public String verificador(){
        if (ligada) {
            return "lampada ligada";
        }else{
            return "Lampada desligada";
        }
    }
}

