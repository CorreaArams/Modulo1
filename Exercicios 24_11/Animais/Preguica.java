package Animais;

public class Preguica extends Animal{
	public String subir;
	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	

	public String deveSubirArvores() {
		return subir;
	}
	
	

}
