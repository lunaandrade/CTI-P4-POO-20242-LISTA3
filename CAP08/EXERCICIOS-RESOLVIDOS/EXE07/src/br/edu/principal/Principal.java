package br.edu.principal;

import java.util.Scanner;

import br.edu.func.funcao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String opc;
		System.out.println("A - calcular a média aritmética");
		System.out.println("P - calcular a média ponderada (valendo 5, 3 e 2)");
		System.out.print("Digite sua opção: ");
		opc = sc.next();
		if (!(opc.equals("A")) && !(opc.equals("P"))) {
			System.out.println("Opção inválida");
		}
		else {
			funcao.calc(opc);
		}
		
	}

}
