package Animais;

public class Cavalo extends Animal {
	public String correr;
	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	
	
	public String getCorrer() {
		return correr;
	}



	public void setCorrer(String correr) {
		this.correr = correr;
	}



	public String deveCorrer() {
		return correr;
	}

}