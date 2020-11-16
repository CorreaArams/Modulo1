import java.util.*;

public class Exercicio1_16_11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float p,e,m;
		System.out.println("Entre com o peso de tomates");
		p = ler.nextInt();
		if(p>50) {
			e = p - 50;
			m = e * 4;
		}
		
		else {
			e = 0;
			m = 0;
		}
		
		
		
		System.out.println("Para o peso de " + p + " digitado, terá "+ e + " quilos em excesso e pagará R$"+ m + " por esse excesso");
	}
}