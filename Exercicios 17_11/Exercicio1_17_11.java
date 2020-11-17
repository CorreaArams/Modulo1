import java.util.*;

//Escreva um programa para ler 2 valores (considere que não serão informados valores iguais)
//e escrever o maior deles.
public class Exercicio1_17_11 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor1=0,valor2 = 0;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		valor2 = ler.nextInt();
		
		while(valor1 == valor2) {
		System.out.println("Digite outro valor diferente do primeiro digitado: ");
		valor2 = ler.nextInt();
		}
		
		if (valor1 > valor2) {
			System.out.println("Valor maior: "+ valor1);
		}
		else {
			System.out.println("Valor maior: "+ valor2);
		}
	
	}

}
