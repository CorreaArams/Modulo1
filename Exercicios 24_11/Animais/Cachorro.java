package Animais;

public class Cachorro extends Animal {
	public String correr;
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	public String deveCorrer() {
		return correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	

}
