package br.edu.principal;

import java.util.Scanner;

import br.edu.func.Func;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, soma;
		
		while (true) {
			System.out.print("Digite o número referente a 'a' (maior que 1): ");
			a = sc.nextInt();
			
			if (a > 1) {
				break;
			}
			
			else {
				System.out.println("Valor inválido");
			}
		}
		
		System.out.print("Digite o número referente a 'b': ");
		b = sc.nextInt();
		
		System.out.print("Digite o número referente a 'c': ");
		c = sc.nextInt();
		
		soma = Func.soma(a, b, c);
		System.out.println("A soma dos divisores de '" + a + "', entre '" + b + "' e '" + c + "' é: " + soma);
		
	}

}