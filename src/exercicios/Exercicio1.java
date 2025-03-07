package exercicios;

import util.Contador;
import util.LimparConsole;

import java.util.Scanner;

public class Exercicio1 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeM = entrada.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = entrada.nextLine();

        LimparConsole.limpar();
        System.out.println("INFORMAÇÕES:\n");
        System.out.println("Nome completo: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Nome da sua mãe: " + nomeM);
        System.out.println("Nome do seu pai: " + nomePai);

        Contador.Contar(5);
    }

}
