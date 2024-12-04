package br.edu.principal;

import java.util.Scanner;

import br.edu.func.funcao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int segundos;
		int [] tempo;
		System.out.print("Digite o numero de segundos: ");
		segundos = sc.nextInt();
		tempo = funcao.converter_segundos(segundos);
		System.out.println("Horas: " + tempo[0] + ", minutos: " + tempo[1] + ", segundos: " + tempo[2]);
	}

}
