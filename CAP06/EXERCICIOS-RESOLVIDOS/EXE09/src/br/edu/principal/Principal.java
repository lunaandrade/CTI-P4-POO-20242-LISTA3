package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voo[] = new int[12], lugares[] = new int[12], i = 0, op1 = 0, op2 = 0, num_voo;
		String origem[] = new String[12], destino[] = new String[12], local;
		
		for (i = 0; i < 12; i++) {
			System.out.println("Digite o número do voo: ");
			voo[i] = sc.nextInt();
			
			System.out.println("Digite a origem do voo: ");
			origem[i] = sc.next();
			
			System.out.println("Digite o destino do voo: ");
			destino[i] = sc.next();
			
			System.out.println("Digite o número de lugares disponíveis do voo: ");
			lugares[i] = sc.nextInt();
		}
		
		while (op1 != 3) {
			System.out.println("     MENU    ");
			System.out.println("1 - Consultar");
			System.out.println("2 - Reservar");
			System.out.println("3 - Sair");

			System.out.println("Digite a opção desejada: ");
			op1 = sc.nextInt();
			
			if (op1 == 1) {
				System.out.println("     MENU CONSULTAR    ");
				System.out.println("1 - Consultar por voo");
				System.out.println("2 - Consultar por origem");
				System.out.println("3 - Consultar por destino ");
				
				System.out.println("Digite a opção desejada: ");
				op2 = sc.nextInt();
				if (op2 == 1) {
					System.out.println("Digite o número do voo: ");
					num_voo = sc.nextInt();
					i = 0;
					
					while ((i < 12) && (voo[i] != num_voo)) {
						i += 1;	
					}
					
					if (i == 12) {
						System.out.println("Voo inexistente!");
					}
					else {
						System.out.println("Número voo: " + voo[i]);
						System.out.println("Local de origem: " + origem[i]);
						System.out.println("Local de destino: " + destino[i]);
						System.out.println("Lugares disponíveis: " + lugares[i]);
					}
				}
				
				else if (op2 == 2) {
					System.out.println("Digite o local de origem do voo: ");
					local = sc.next();
					boolean encontrei = false;
					
					for (i = 0; i < 12; i++) {
						if (local.equals(origem[i])) {
							System.out.println("VOO ENCONTRADO! Aqui estão as informações sobre ele ->");
							System.out.println("Número do voo: " + voo[i]);
							System.out.println("Local de origem: " + origem[i]);
							System.out.println("Local de destino: " + destino[i]);
							System.out.println("Lugares disponíveis: " + lugares[i]);
							encontrei = true;
						}
					}
						
					if (encontrei == false) {
						System.out.println("Não há nenhum voo com esta origem");
					}
					
					}
			}
			
				else if (op2 == 3) {
					System.out.println("Digite o local de destino do voo: ");
					local = sc.next();
					boolean encontrei = false;
					for (i = 0; i < 12; i++) {
						
						if (local.equals(destino[i])) {
							System.out.println("VOO ENCONTRADO! Aqui estão as informações sobre ele ->");
							System.out.println("Número do voo: " + voo[i]);
							System.out.println("Local de origem: " + origem[i]);
							System.out.println("Local de destino: " + destino[i]);
							System.out.println("Lugares disponíveis: " + lugares[i]);
							encontrei = true;
						}
					}
					if (encontrei == false) {
						System.out.println("Nenhum voo com este destino foi encontrado");
					}
				}
			
			
			else if (op1 == 2) {
				System.out.println("Digite o número do voo desejado: ");
				num_voo = sc.nextInt();
				
				i = 0;
				while ((i < 12) && (voo[i] != num_voo)) {
					i += 1;
				}
				
				if (i == 12) {
					System.out.println("Número de voo não encontrado");
				}
				else {
					if (lugares[i] == 0) {
						System.out.println("Voo lotado");
					}
					else {
						lugares[i] = lugares[i] - 1;
						System.out.println("Reserva confirmada");

					}
				}
			}
			
		}

	}

}