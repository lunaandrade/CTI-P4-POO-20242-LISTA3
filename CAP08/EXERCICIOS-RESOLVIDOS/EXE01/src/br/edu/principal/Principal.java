package br.edu.principal;
import java.util.Scanner;

import br.edu.func.Func;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, x;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		x = Func.verifica(numero);
		
		if (x == 1) {
			System.out.println("O número é positivo!");
		}
		else {
			System.out.println("O número é negativo!");
		}
	}
}