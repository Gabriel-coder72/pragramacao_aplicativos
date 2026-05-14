package javaTarde_Orientacao_objeto.Atividade1.Atividade10;

public class Main {
     public static void main(String[] args) {
         Termometro t1 = new Termometro(25);
         System.out.println("Temperatura em Celsius: " + t1.celsius);
         System.out.println("Temperatura em Fahrenheit: " + t1.converterFahrenheit());
         System.out.println("Temperatura em Kelvin: " + t1.converterKelvin());

    }
}
