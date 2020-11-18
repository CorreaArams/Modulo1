import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class Exercicio2_18_11 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int par = 0,impar = 0,num;
		for(int i=0;i<10;i++) {
		
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			if((num % 2) == 0) {
				par++;
			}
			else {
				impar++;
			}
		
		}
		
		System.out.println("Numeros pares digitados: "+par+"\nNumeros ímpares digitados: "+impar);
	}
}