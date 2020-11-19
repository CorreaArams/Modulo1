import java.util.Scanner;

//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;

public class Exercicio2a_19_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int [][] n1 = new int [4][6];
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		
		for(int linha = 0;linha<4;linha++) {
			for(int coluna = 0;coluna<6;coluna++) {
				
			System.out.println("Entre com o valor da matriz 1: ");
			n1[linha][coluna] = ler.nextInt();
			
			}
			
		}
		
		for(int linha = 0;linha<4;linha++) {
			for(int coluna = 0;coluna<6;coluna++) {
				
			System.out.println("Entre com o valor da matriz 2: ");
			n2[linha][coluna] = ler.nextInt();
			
			}
			
		}
		System.out.println("Matriz M2:\n");
		for(int linha = 0;linha<4;linha++) {
			for(int coluna = 0;coluna<6;coluna++) {
			m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
			}
			
		}
		for(int linha = 0;linha<4;linha++) {
			for(int coluna = 0;coluna<6;coluna++) {
				
			System.out.print(" "+ m1[linha][coluna]);
			}
			System.out.println("\n");
			
		}
	}
	
}