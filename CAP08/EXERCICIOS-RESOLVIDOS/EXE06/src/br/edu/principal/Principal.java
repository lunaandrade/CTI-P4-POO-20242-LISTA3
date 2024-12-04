package br.edu.principal;
import java.util.Scanner;

import br.edu.func.Func;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 9: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 9);
            Func.multi(numero);
    }
}