import java.util.Scanner;

public class Exercicio3_16_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3,n4,quad1,quad2,quad3,quad4;
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		System.out.println("Digite o quarto número: ");
		n4 = ler.nextInt();
		
		quad1 = n1 * n1;
		quad2 = n2 * n2;
		quad3 = n3 * n3;
		quad4 = n4 * n4;
		
		if(quad3>=1000) {
			System.out.println("o quadrado de " + n3 + " é " + quad3);
			
		}
		
		else {
			
			System.out.println("o quadrado de " + n1 + " é " + quad1 + "\no quadrado de " + n2 + " é " + quad2 + "\no quadrado de " + n3 + " é " + quad3 + "\no quadrado de " + n4 + " é " + quad4);
		}

	}

}
