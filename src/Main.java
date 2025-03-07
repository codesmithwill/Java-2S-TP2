import exercicios.*;
import util.LimparConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        while (opcao != -1) {
            System.out.println("TP2 - Java\n");
            System.out.println("1 - Exercício 01");
            System.out.println("2 - Exercício 02");
            System.out.println("3 - Exercício 03");
            System.out.println("4 - Exercício 04");
            System.out.println("5 - Exercício 05");
            System.out.println("6 - Exercício 06");
            System.out.println("7 - Exercício 07");
            System.out.println("8 - Exercício 08");
            System.out.println("9 - Exercício 09");
            System.out.println("10 - Exercício 10");
            System.out.println("11 - Exercício 11");
            System.out.println("12 - Exercício 12");
            System.out.println("\n-1 - Para encerrar a aplicação.");
            System.out.print("Digite a opção desejada: ");

            if (input.hasNextInt()) {
                opcao = input.nextInt();
            } else {
                System.out.println("Insira um número válido.");
                input.next();
                continue;
            }

            switch(opcao) {
                case 1:
                    LimparConsole.limpar();
                    Exercicio1 ex1 = new Exercicio1();
                    ex1.Executar();
                    break;
                case 2:
                    LimparConsole.limpar();
                    Exercicio2 ex2 = new Exercicio2();
                    ex2.Executar();
                    break;
                case 3:
                    LimparConsole.limpar();
                    Exercicio3 ex3 = new Exercicio3();
                    ex3.Executar();
                    break;
                case 4:
                    LimparConsole.limpar();
                    Exercicio4 ex4 = new Exercicio4();
                    ex4.Executar();
                    break;
                case 5:
                    LimparConsole.limpar();
                    Exercicio5 ex5 = new Exercicio5();
                    ex5.Executar();
                    break;
                case 6:
                    LimparConsole.limpar();
                    Exercicio6 ex6 = new Exercicio6();
                    ex6.Executar();
                    break;
                case 7:
                    LimparConsole.limpar();
                    Exercicio7 ex7 = new Exercicio7();
                    ex7.Executar();
                    break;
                case 8:
                    LimparConsole.limpar();
                    Exercicio8 ex8 = new Exercicio8();
                    ex8.Executar();
                    break;
                case 9:
                    LimparConsole.limpar();
                    Exercicio9 ex9 = new Exercicio9();
                    ex9.Executar();
                    break;
                case 10:
                    LimparConsole.limpar();
                    Exercicio10 ex10 = new Exercicio10();
                    ex10.Executar();
                    break;
                case 11:
                    LimparConsole.limpar();
                    Exercicio11 ex11 = new Exercicio11();
                    ex11.Executar();
                    break;
                case 12:
                    LimparConsole.limpar();
                    Exercicio12 ex12 = new Exercicio12();
                    ex12.Executar();
                    break;
                case -1:
                    break;
            }
        }
        input.close();
    }
}