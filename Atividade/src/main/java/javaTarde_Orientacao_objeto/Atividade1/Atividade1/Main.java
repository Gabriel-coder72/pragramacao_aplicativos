package javaTarde_Orientacao_objeto.Atividade1.Atividade1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        LAMPADA lamp = new LAMPADA();

        String resultadoLampada = lamp.verificador();

        System.out.println(resultadoLampada);
    }
}
