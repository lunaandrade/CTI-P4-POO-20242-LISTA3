package br.edu.func;

import java.util.Scanner;

public class funcao {
	public static void calc(String opc) {
		Scanner sc = new Scanner(System.in);  
		double n1, n2, n3, result;
		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = sc.nextDouble();
		//Questão 7, capítulo 8
		if (opc == "A") {
			result = (n1 + n2 + n3) / 3;
			System.out.println("A média aritmética é: " + result);
		}
		else {
			result = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
			System.out.println("A média ponderada é: " + result);
		}
	}
}
