package exercicios;

import util.Contador;
import util.LimparConsole;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

    public void Executar() {
        /*        Fonte: https://borainvestir.b3.com.br/noticias/imposto-de-renda/tabela-do-imposto-de-renda-2025-saiba-quanto-a-receita-federal-morde-do-seu-salario/         */
        double aliquota; double calculo; double parcela;
        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.print("Digite a sua renda bruta anual: ");
        double renda = entrada.nextDouble();

        if (renda <= 2259.20) {
            LimparConsole.limpar();
            System.out.println("Você não paga imposto de renda.");
        } else if (renda >= 2259.21 && renda <= 2828.65) {
            LimparConsole.limpar();
            aliquota = 0.075;
            calculo = renda * aliquota;
            System.out.println("Sua renda bruta: " + df.format(renda));
            System.out.println("Sua alíquota é de: " + aliquota * 100 + "%.");
            System.out.println("Parcela mensal do IR: " + df.format(calculo));
        } else if (renda >= 2826.66 && renda <= 3751.05) {
            LimparConsole.limpar();
            aliquota = 0.15;
            calculo = renda * aliquota;
            System.out.println("Sua renda bruta: " + df.format(renda));
            System.out.println("Sua alíquota é de: " + aliquota * 100 + "%.");
            System.out.println("Parcela mensal do IR: " + df.format(calculo));
        } else if (renda >= 3751.06 && renda <= 4664.68) {
            LimparConsole.limpar();
            aliquota = 0.225;
            calculo = renda * aliquota;
            System.out.println("Sua renda bruta: " + df.format(renda));
            System.out.println("Sua alíquota é de: " + aliquota * 100 + "%.");
            System.out.println("Parcela mensal do IR: " + df.format(calculo));
        } else if (renda >= 4664.68) {
            LimparConsole.limpar();
            aliquota = 0.275;
            calculo = renda * aliquota;
            DecimalFormat porcent = new DecimalFormat("#,##0.00");
            System.out.println("Sua renda bruta: " + df.format(renda));
            System.out.println("Sua alíquota é de: " + porcent.format(aliquota * 100) + "%.");
            System.out.println("Parcela mensal do IR: " + df.format(calculo));
        }
        Contador.Contar(5);
    }
}