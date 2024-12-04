package br.edu.principal;
import java.util.Arrays;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] valor_unit = new int[10];
	    int[] qntd_venda_por_peca = new int[10];
	    int[] valor_total_por_peca = new int[10];
	    
	    int contador1 = 0;
	    System.out.println("Digite os valores dos objetos:");
	    while (contador1 < valor_unit.length) {
	        valor_unit[contador1] = scanner.nextInt();
	        contador1++;
	    }
	    int contador2 = 0;
	    System.out.println("Digite os valores das vendas:");
	    while (contador2 < qntd_venda_por_peca.length) {
	        qntd_venda_por_peca[contador2] = scanner.nextInt();
	        contador2++;
	    }
	    
	    int contador3 = 0;
	    while (contador3 < valor_total_por_peca.length) {
	        valor_total_por_peca[contador3] = qntd_venda_por_peca[contador3] * qntd_venda_por_peca[contador3];
	        contador3++;
	        
	    }
	    
	    int flag = 0;
	    int contador = 0;
	    int posicao_peca_mais_vendida = 0;
	    System.out.println("Quantidade vendida dos objetos");
	    for (int qntds_vendas_por_peca: qntd_venda_por_peca) {
	        System.out.println(qntds_vendas_por_peca);
	        contador++;
	        if (qntds_vendas_por_peca > flag) {
	            flag = qntds_vendas_por_peca;
	            posicao_peca_mais_vendida = contador;
	        }
	    }
	    
	    System.out.println("Valor unitário dos objetos");
	    for (int valores_unit: valor_unit) {
	        System.out.println(valores_unit);
	    }
	    
	    int valor_total_vendas = 0;
	    System.out.println("Valor todas das vendas dos objetos: ");
	    for (int valores_totais_por_peca: valor_total_por_peca) {
	        valor_total_vendas = valor_total_vendas + valores_totais_por_peca;
	        System.out.println(valores_totais_por_peca);
	    }
	    
	    System.out.println("Valor total das vendas é: R$" +valor_total_vendas);
	    System.out.println("Valor da comissão é: R$" + valor_total_vendas * 0.05);
	    System.out.println("O valor da peça mais vendida é de: R$" + flag);
	    System.out.println("A posição da peça mais vendida é " + posicao_peca_mais_vendida);
		
	}
}