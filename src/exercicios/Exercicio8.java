package exercicios;

import util.Contador;
import util.LimparConsole;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

    public void Executar() {

        while(true) {
            LimparConsole.limpar();
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite os comprimentos do lados do triângulo");
            System.out.print("Lado 1: ");
            double lado1 = entrada.nextDouble();

            System.out.print("Lado 2: ");
            double lado2 = entrada.nextDouble();

            System.out.print("Lado 3: ");
            double lado3 = entrada.nextDouble();

            if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("O triangulo é equilátero.");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("O triângulo é Isósceles.");
                } else {
                    System.out.println("O triângulo é Escaleno.");
                }
            } else {
                System.out.println("Os lados informados não formam um triângulo válido.");
            }

            System.out.print("Deseja verificar outro triângulo? (s/n): ");
            char resposta = entrada.next().toLowerCase().charAt(0);
            if (resposta == 'n') {
                break;
            }
        }
    }
}