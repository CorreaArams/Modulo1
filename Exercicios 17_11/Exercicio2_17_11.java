import java.util.Scanner;

// Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio.
// A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes mensagens:
// ACESSO PERMITIDO caso a senha seja v�lida. ACESSO NEGADO caso a senha seja inv�lida.

public class Exercicio2_17_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String senha = "1234";
		String digitado;
		
		System.out.println("Digite a senha de acesso: ");
		digitado = ler.nextLine();
		
		while(!(digitado.equals(senha))) {
			System.out.println("ACESSO NEGADO\n");
			System.out.println("Digite a senha de acesso correta: ");
			digitado = ler.nextLine();
			}
			System.out.println("ACESSO PERMITIDO");
		
		}
		
		
	
}


