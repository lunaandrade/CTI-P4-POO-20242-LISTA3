package br.edu.principal;

import java.util.Scanner;

import br.edu.func.funcao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double acrescimo, valor_inicial, valor_final;;
		System.out.print("Digite o valor inicial: ");
		valor_inicial = sc.nextDouble();
		System.out.print("Digite o valor final: ");
		valor_final = sc.nextDouble();
		acrescimo = funcao.calcula_reajuste(valor_inicial, valor_final);
		System.out.print(acrescimo);
	}

}
