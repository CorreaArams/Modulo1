import java.util.Scanner;

public class Exercicio3_13_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,c,r,s;
		float d;
		System.out.println("Sabendo que r = (a + b) * (a + b) \ns = (b + c) * (b + c) \nd = (r + s) / 2 ");
		System.out.println("Entre com um valor inteiro positivo para a: ");
		a = ler.nextInt();
		System.out.println("Entre com um valor inteiro positivo para b: ");
		b = ler.nextInt();
		System.out.println("Entre com um valor inteiro positivo para c: ");
		c = ler.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println("o Valor de d = : " + d);
	}
}