package Animais;

public class Main {
	public static void main (String[] args) {
		Preguica preguicinha = new Preguica("Preguicinha", 10, "yukeeeeee");
		System.out.println(preguicinha.getNome() + " " + preguicinha.getIdade() + " Anos " + preguicinha.emitirSom());
		
		Cavalo cavalinho = new Cavalo("Cavalinho",5,"wiiiiiiiihihihihi");
		System.out.println(cavalinho.getNome() + " " + cavalinho.getIdade() + " Anos " + cavalinho.emitirSom());
		
		Cachorro cachorrinho = new Cachorro("Cachorrinho", 2,"AuAu");
		System.out.println(cachorrinho.getNome() + " " + cachorrinho.getIdade() + " Anos " + cachorrinho.emitirSom());
		
		
		
		
		}
}
