package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gabar[] = new String[8], resposta[] = new String[8];
		int num, pont, tot_ap, perc_ap, i = 1, j = 1;
		
		System.out.println("Atenção! Digite os itens de 'a' à 'e' minusculos");
		for (i = 0; i < 8; i++) {
			System.out.println("Digite o gabarito da questão: ");
			gabar[i] = sc.next();
		}
			
		tot_ap = 0;
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o número do " + i + "º aluno: ");
			num = sc.nextInt();
			pont = 0;
			for (j = 0; j < 8; j++) {
				System.out.println("Digite a resposta dada pelo aluno " + num + " à questão: ");
				resposta[j] = sc.next();
				
				if (resposta[j].equals(gabar[j])) {
					pont += 1;
				}
			}
			System.out.println("A nota do aluno " + num + " foi " + pont);
			if (pont >= 6) {
				tot_ap += 1;
			}
		}
		 
		perc_ap = tot_ap * 100 / 10;
		System.out.println("O percentual de alunos aprovados é " + perc_ap + "%");
	}
}