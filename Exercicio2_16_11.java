import java.util.Scanner;

public class Exercicio2_16_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int c,n,e,valor,salario;
		System.out.println("Digite o código do operário: ");
		c = ler.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		n = ler.nextInt();
		
		
		
		if(n>50) {
			e = n - 50;
			valor = e * 20;
			salario = 50 * 10;
			
			
		}
		
		else {
			e = 0;
			valor = 0;
			salario = n * 10;
		}
		
		System.out.println("Salario de R$" + salario + " e mais o excedente de  R$" + valor);
	}
}