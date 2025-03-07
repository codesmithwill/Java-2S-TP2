package exercicios;

import util.Contador;
import util.LimparConsole;

import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int tentativas = 0;
        int numeroAleatorio = aleatorio.nextInt(101);

        System.out.println("Tente adivinhar o número de 0 á 100.");
        int palpite = -1;

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = entrada.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número aleatório é maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número aleatório é menor.");
            }
        }

        LimparConsole.limpar();
        System.out.println("Parabéns! Você acertou o número aleatório!");
        System.out.println("O número aleatório era: " + numeroAleatorio);
        System.out.println("Tentativas: " + tentativas);
        Contador.Contar(5);
    }
}