package exercicios;

import util.Contador;
import util.LimparConsole;

import java.util.Scanner;

public class Exercicio2 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);

        int numeros = 0;
        System.out.print("Digite a 1ª nota bimestral: ");
        double primeiraNota = entrada.nextDouble();
        numeros++;

        System.out.print("Digite a 2ª nota bimestral: ");
        double segundaNota = entrada.nextDouble();
        numeros++;

        System.out.print("Digite a 3ª nota bimestral: ");
        double terceiraNota = entrada.nextDouble();
        numeros++;

        System.out.print("Digite a 4ª nota bimestral: ");
        double quartaNota = entrada.nextDouble();
        numeros++;

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / numeros;

        LimparConsole.limpar();

        System.out.println("/----/ Cálculo de Média /----/");
        System.out.println("Quantidade de notas: " + numeros);
        System.out.println("Média Bimestral: " + media);

        if (media < 5) {
            System.out.println("\nAtenção: Você foi reprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("\nAtenção: Você está em recuperação!");
        } else {
            System.out.println("\nParabéns! Você foi aprovado!");
        }

        Contador.Contar(5);
    }

}
