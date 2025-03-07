package exercicios;

import util.Contador;
import util.LimparConsole;

import java.util.Scanner;

public class Exercicio12 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");

        String frase = entrada.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("Você não digitou nada.");
            return;
        }

        String[] palavras = frase.split("\\s+");
        System.out.println("A frase contém: " + palavras.length + " palavras.");

        Contador.Contar(5);
    }
}