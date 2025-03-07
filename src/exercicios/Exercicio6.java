package exercicios;

import util.Contador;
import util.LimparConsole;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano: " + ano + " é bissexto.");
        } else {
            System.out.println("O ano: " + ano + " não é bissexto.");
        }

        Contador.Contar(5);
    }
}