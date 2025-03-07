package exercicios;

import util.Contador;
import util.LimparConsole;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio5 {

    public void Executar() {
        /*
        Valor > 1000 = 10% desconto
        Valor >= 500 && Valor <= 1000 = 5% desconto
        Valor < 500 = Não tem.
         */
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        double valor; double desconto; double valorDescontado; double valorFinal;

        System.out.print("Digite o valor do produto: R$ ");
        valor = entrada.nextDouble();

        if (valor < 500) {
            System.out.println("O valor foi: R$ " + df.format(valor));
            System.out.println("Infelizmente, você não possui direito á descontos.");
        } else if (valor >= 500 && valor <= 1000) {
            desconto = 0.05;
            System.out.println("O valor foi: R$ " + df.format(valor));
            System.out.println("Você tem direito á: " + desconto * 100 + "% de desconto.");
            valorDescontado = valor * desconto;
            valorFinal = valor - valorDescontado;
            System.out.println("O valor final foi de: " + df.format(valorFinal));
            System.out.println("Valor do desconto: " + df.format(valorDescontado));
        } else if (valor > 1000) {
            desconto = 0.10;
            System.out.println("O valor foi: R$ " + df.format(valor));
            System.out.println("Você tem direito á: " + desconto * 100 + "% de desconto.");
            valorDescontado = valor * desconto;
            valorFinal = valor - valorDescontado;
            System.out.println("O valor final foi de: " + df.format(valorFinal));
            System.out.println("Valor do desconto: " + df.format(valorDescontado));
        }

        Contador.Contar(5);
    }
}