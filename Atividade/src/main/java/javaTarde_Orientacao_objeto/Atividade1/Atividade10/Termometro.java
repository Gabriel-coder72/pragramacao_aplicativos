package javaTarde_Orientacao_objeto.Atividade1.Atividade10;

public class Termometro {
    double celsius;
    public Termometro(double temperatura){
        celsius = temperatura;
    }
    public double converterFahrenheit() {
        return celsius * 1.8 + 32;
    }
    public double converterKelvin(){
     return celsius + 273.15;
    }
}
