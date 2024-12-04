package br.edu.principal;

import java.util.Scanner;

import br.edu.func.funcao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		int horaf, minf, horai, mini, total;
		while (true) {
		System.out.print("Digite a hora inicial: ");
		horai = sc.nextInt();
		System.out.print("Digite o minuto inicial: ");
		mini = sc.nextInt();
		System.out.print("Digite a hora final: ");
		horaf = sc.nextInt();
		System.out.print("Digite o minuto final: ");
		minf = sc.nextInt();
			if (mini >= 60 ) {
				System.out.print("Horário(s) inválido(s)");
			}
			else {
				break;
			}
		}
		total = funcao.calc(horai, mini, horaf, minf);
		System.out.println("O tempo de duração em minutos foi: " + total);
		
	}

}
