import java.util.Scanner;
// As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia,
// e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o n�mero de ma��s compradas,
// calcule e escreva o valor total da compra.

public class Exercicio3_17_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float quantidade;
		double valor = 0;
		
		System.out.println("Digite a quantidade de ma��s desejadas: ");
		quantidade = ler.nextFloat();
		
		if(quantidade<12) {
			valor = quantidade * 0.30;
		}
		else {
			valor = quantidade * 0.25;
		}
		
		System.out.println("valor total da compra: R$" + valor);
	}
}