import java.util.Scanner;

public class Exercicio2_13_11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float custofabrica;
		double custoconsumidor;
		System.out.println("Entre com o custo de fabrica: ");
		custofabrica = ler.nextFloat();
		
		custoconsumidor = custofabrica * 1.73 ;
		
		
		System.out.println("Custo do consumidor será de : R$ " + custoconsumidor);
	}
}