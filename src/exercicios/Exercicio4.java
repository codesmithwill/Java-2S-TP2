package exercicios;

import util.Contador;
import util.LimparConsole;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);
        boolean dataValida = false;
        int dia = 0, mes = 0, ano = 0;

        // Loop para garantir que o usuário insira uma data válida
        while (!dataValida) {
            System.out.print("Digite o seu dia de nascimento (dd): ");
            dia = entrada.nextInt();

            System.out.print("Digite o seu mês de nascimento (mm): ");
            mes = entrada.nextInt();

            System.out.print("Digite o seu ano de nascimento (aaaa): ");
            ano = entrada.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("Mês inválido! O mês deve estar entre 1 e 12.");
                continue;
            }

            if (dia < 1 || dia > 31) {
                System.out.println("Dia inválido! O dia deve estar entre 1 e 31.");
                continue;
            }

            if (mes == 2 && (dia > 29 || (dia == 29 && !anoBissexto(ano)))) {
                System.out.println("Dia inválido! Fevereiro tem no máximo 29 dias.");
                continue;
            }

            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                System.out.println("Dia inválido! Este mês tem no máximo 30 dias.");
                continue;
            }

            dataValida = true;
        }

        LocalDate dAtual = LocalDate.now();
        LocalDate dNascimento = LocalDate.of(ano, mes, dia);

        long idadeDias = ChronoUnit.DAYS.between(dNascimento, dAtual);

        LimparConsole.limpar();
        System.out.println("Sua idade em DIAS é: " + idadeDias + " dias.");

        Contador.Contar(5);
    }

    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }

}
