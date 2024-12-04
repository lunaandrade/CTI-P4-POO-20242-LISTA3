package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pri[] = new int[5], seg[] = new int[5], tot[] = new int[10], i = 0, j, z, num;
		
		for (i = 0; i < 5;i++) {
			System.out.println("Digite os números do primeiro vetor: ");
			pri[i] = sc.nextInt();
		}
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				if (pri[j] > pri[j + 1]) {
					num = pri[j];
					pri[j] = pri[j + 1];
					pri[j + 1] = num;
				}
			}
		}
		
		for (i = 0; i < 5; i++) {
			System.out.println("Digite os números do segundo vetor: ");
			seg[i] = sc.nextInt();
		}
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				if (seg[j] > seg[j + 1]) {
					num = seg[j];
					seg[j] = seg[j + 1];
					seg[j + 1] = num;
				}
			}
		}
		
		j = 0;
		
		for (i = 0; i < 5; i++) {
			tot[j] = pri[i];
			j += + 1;
			tot[j] = seg[i];
			j += 1;
		}
		
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 9; j++) {
				if (tot[j] > tot[j + 1]) {
					num = tot[j];
					tot[j] = tot[j+1];
					tot[j + 1] = num;
				}
			}
		}
		
		System.out.println("O primeiro vetor em ordem crescente é -> ");
		for (i = 0; i < 5; i++) {
			System.out.print(pri[i] + " ");
		}
		System.out.println();
		System.out.println("O segundo vetor em ordem crescente é -> ");
		for (i = 0; i < 5; i++) {
			System.out.print(seg[i] + " ");
		}
		System.out.println();
		System.out.println("A junção dos vetores em ordem crescente é -> ");
		for (i = 0; i < 10; i++) {
			System.out.print(tot[i] + " ");
		}
	}

}