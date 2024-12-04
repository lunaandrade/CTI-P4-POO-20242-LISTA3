package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[8], j = 0, z, num, i = 0;
		
		while (i < 8) {
			j = 0;
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			while ((j < i) && (vetor[j] < num)) {
				j += 1;
			}
			
			z = i;
			while (z > j) {
				vetor[z] = vetor[z - 1];
				z -= 1;
			}
			vetor[j] = num;
			i += 1;
		}
		
		System.out.println("A sequência ficou assim -> ");
		for (i = 0; i < 8; i++) {
			System.out.print(vetor[i] + " ");
			}
	}

}