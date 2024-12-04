package br.edu.func;

import java.util.Scanner;

public class Funções {
	public static void menor_maior() {
		//Questão 9, capítulo 8
		Scanner sc = new Scanner(System.in); 
		int n1, n2, n3, n4, n5;
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		n3 = sc.nextInt();
		System.out.print("Digite o quarto numero: ");
		n4 = sc.nextInt();
		System.out.print("Digite o quinto numero: ");
		n5 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
			if (n2 < n3 && n2 < n4 && n2 < n5) {
				System.out.print("O maior número é: " + n1 + " e o menor número é: " + n2);
			}
			else if (n3 < n2 && n3 < n4 && n3 < n5) {
				System.out.print("O maior número é: " + n1 + " e o menor número é: " + n3);
			}
			else if (n4 < n2 && n4 < n3 && n4 < n5) {
				System.out.print("O maior número é: " + n1 + " e o menor número é: " + n4);
			}
			else {
				System.out.print("O maior número é: " + n1 + " e o menor número é: " + n5);
			}
		}
		else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
			if (n1 < n3 && n1 < n4 && n1 < n5) {
				System.out.print("O maior número é: " + n2 + " e o menor número é: " + n1);
			}
			else if (n3 < n1 && n3 < n4 && n3 < n5) {
				System.out.print("O maior número é: " + n2 + " e o menor número é: " + n3);
			}
			else if (n4 < n1 && n4 < n3 && n4 < n5) {
				System.out.print("O maior número é: " + n2 + " e o menor número é: " + n4);
			}
			else {
				System.out.print("O maior número é: " + n2 + " e o menor número é: " + n5);
			}
		}
		else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
			if (n1 < n2 && n1 < n4 && n1 < n5) {
				System.out.print("O maior número é: " + n3 + " e o menor número é: " + n1);
			}
			else if (n2 < n1 && n2 < n4 && n2 < n5) {
				System.out.print("O maior número é: " + n3 + " e o menor número é: " + n2);
			}
			else if (n4 < n1 && n4 < n2 && n4 < n5) {
				System.out.print("O maior número é: " + n3 + " e o menor número é: " + n4);
			}
			else {
				System.out.print("O maior número é: " + n3 + " e o menor número é: " + n5);
			}
		}
		else if (n4 > n1 && n4 > n3 && n4 > n2 && n4 > n5) {
			if (n1 < n3 && n1 < n2 && n1 < n5) {
				System.out.print("O maior número é: " + n4 + " e o menor número é: " + n1);
			}
			else if (n2 < n1 && n2 < n3 && n2 < n5) {
				System.out.print("O maior número é: " + n4 + " e o menor número é: " + n3);
			}
			else if (n3 < n1 && n3 < n2 && n3 < n5) {
				System.out.print("O maior número é: " + n4 + " e o menor número é: " + n3);
			}
			else {
				System.out.print("O maior número é: " + n4 + " e o menor número é: " + n5);
			}
		}
		else {
			if (n1 < n3 && n1 < n2 && n1 < n4) {
				System.out.print("O maior número é: " + n5 + " e o menor número é: " + n1);
			}
			else if (n2 < n1 && n2 < n3 && n2 < n4) {
				System.out.print("O maior número é: " + n5 + " e o menor número é: " + n2);
			}
			else if (n3 < n1 && n3 < n2 && n3 < n4) {
				System.out.print("O maior número é: " + n5 + " e o menor número é: " + n3);
			}
			else {
				System.out.print("O maior número é: " + n5 + " e o menor número é: " + n4);
			}
		}
	}
}