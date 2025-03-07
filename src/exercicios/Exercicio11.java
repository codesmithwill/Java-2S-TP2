package exercicios;

import util.Contador;
import util.LimparConsole;

import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o incremento: ");
        int num2 = entrada.nextInt();

        LimparConsole.limpar();
        for (int i = num1; i <= 100; i += num2) {
            System.out.print(i);
            if (i + num2 <= 100) {
                System.out.print(", ");
            }
        }
        Contador.Contar(5);
    }
}