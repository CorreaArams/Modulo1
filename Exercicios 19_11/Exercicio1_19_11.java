import java.util.Scanner;

//	Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
//	Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
//	A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,
//	contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

public class Exercicio1_19_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float media =0;
		int soma = 0,cont = 0;
		int [] dado = new int [10];
		
		for(int i = 0;i<10;i++) {
			System.out.println("Entre com o valor dos lan�amentos: ");
			dado[i] = ler.nextInt();
			soma = soma + dado[i];
			
			
		}
		
		for(int i=0;i<10;i++) {
		
			System.out.println("lan�amento "+(i+1)+ " foi "+ dado[i]);
			media = soma/10;
			if(dado[i] == 6) {
				cont++;
			}
			
			}
			System.out.println("\nA m�dia dos lan�amentos foi de: "+ media);
			System.out.println("\nO numero 6 foi tirado: "+ cont+ " vezes");
		}
		
		
	
}