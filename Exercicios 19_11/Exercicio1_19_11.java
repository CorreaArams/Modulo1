import java.util.Scanner;

//	Um dado é lançado 10 vezes e o valor correspondente é anotado.
//	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
//	A seguir determine e imprima a média aritmética dos lançamentos,
//	contabilize e apresente também quantas foram as ocorrências da maior pontuação.

public class Exercicio1_19_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float media =0;
		int soma = 0,cont = 0;
		int [] dado = new int [10];
		
		for(int i = 0;i<10;i++) {
			System.out.println("Entre com o valor dos lançamentos: ");
			dado[i] = ler.nextInt();
			soma = soma + dado[i];
			
			
		}
		
		for(int i=0;i<10;i++) {
		
			System.out.println("lançamento "+(i+1)+ " foi "+ dado[i]);
			media = soma/10;
			if(dado[i] == 6) {
				cont++;
			}
			
			}
			System.out.println("\nA média dos lançamentos foi de: "+ media);
			System.out.println("\nO numero 6 foi tirado: "+ cont+ " vezes");
		}
		
		
	
}