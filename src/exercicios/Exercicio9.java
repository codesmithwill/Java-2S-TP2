package exercicios;

import util.Contador;
import util.LimparConsole;

import java.util.Scanner;

public class Exercicio9 {

    public void Executar() {
        Scanner entrada = new Scanner(System.in);
        boolean senhaIgual = false;

        System.out.print("Digite a senha desejada: ");
        String senha = entrada.nextLine();

        while(!senhaIgual) {
            System.out.print("Digite a senha novamente: ");
            String senhaConfirmacao = entrada.nextLine();

            if (senha.equals(senhaConfirmacao)) {
                senhaIgual = true;
                LimparConsole.limpar();
                System.out.println("Senha cadastrada.");
            } else {
                System.out.println("Senha não coincide.");
            }
        }
        Contador.Contar(5);
    }
}