import java.util.Scanner;

public class Exercicio1_13_11 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float a,b,c,media;
		System.out.println("Entre com a primeira nota: ");
		a = ler.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		b = ler.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		c = ler.nextFloat();
		
		media = ((a * 2) + (b * 3) + (c * 5))/10;
		
		System.out.println("Valor da média ponderada é: " + media);
	}
}