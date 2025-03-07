package exercicios;

import util.Contador;
import util.LimparConsole;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);

        double euroAtual = 6.13;
        double dolarAtual = 5.91;
        double libraAtual = 7.41;
        double taxConversao = 0.05;

        System.out.println("/----/ Tabela de Moedas /----/");
        System.out.println("O valor do EURO atual: R$ " + euroAtual);
        System.out.println("O valor do DÓLAR atual: R$ " + dolarAtual);
        System.out.println("O valor da LIBRA atual: R$ " + libraAtual);
        System.out.println("Taxa de Conversão de: 5%");

        System.out.println("Opções de Destino:");
        System.out.println("1 - Euro");
        System.out.println("2 - Dólar");
        System.out.println("3 - Libra");

        System.out.print("\nDigite a opção desejada: ");
        int opcao = entrada.nextInt();

        switch(opcao) {
            case 1:
                System.out.print("\nDigite o valor á ser convertido: R$ ");
                double reais = entrada.nextDouble();
                LimparConsole.limpar();

                double valorConv = reais * euroAtual;
                double calculo = valorConv * (1 - taxConversao);

                System.out.println("Convertendo...");
                Contador.Contar(3);
                LimparConsole.limpar();

                DecimalFormat df = new DecimalFormat("R$ #,##0.00");
                System.out.println("/----/ Conversão para Euro /---/");
                System.out.println("Valor em Reais: R$ " + reais);
                System.out.println("Taxa de Conversão: " + taxConversao * 100 + " %");
                System.out.println("Cotação do Euro: R$ " + euroAtual);
                System.out.println("\nValor Convertido: " + df.format(calculo));
                break;
            case 2:
                System.out.print("\nDigite o valor á ser convertido: R$ ");
                reais = entrada.nextDouble();
                LimparConsole.limpar();

                valorConv = reais * dolarAtual;
                calculo = valorConv * (1 - taxConversao);

                System.out.println("Convertendo...");
                Contador.Contar(3);
                LimparConsole.limpar();

                df = new DecimalFormat("R$ #,##0.00");
                System.out.println("/----/ Conversão para Dólar /---/");
                System.out.println("Valor em Reais: R$ " + reais);
                System.out.println("Taxa de Conversão: " + taxConversao * 100 + " %");
                System.out.println("Cotação do Dólar: R$ " + dolarAtual);
                System.out.println("\nValor Convertido: " + df.format(calculo));
                break;
            case 3:
                System.out.print("\nDigite o valor á ser convertido: R$ ");
                reais = entrada.nextDouble();
                LimparConsole.limpar();

                valorConv = reais * libraAtual;
                calculo = valorConv * (1 - taxConversao);

                System.out.println("Convertendo...");
                Contador.Contar(3);
                LimparConsole.limpar();

                df = new DecimalFormat("R$ #,##0.00");
                System.out.println("/----/ Conversão para Libra /---/");
                System.out.println("Valor em Reais: R$ " + reais);
                System.out.println("Taxa de Conversão: " + taxConversao * 100 + " %");
                System.out.println("Cotação da Libra: R$ " + libraAtual);
                System.out.println("\nValor Convertido: " + df.format(calculo));
                break;
            default:
                break;
        }
        Contador.Contar(5);
    }
}
