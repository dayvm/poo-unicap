package br.com.unicap.poo;

public class Cachorro extends Pet{
    private String raca;

    public Cachorro (String nome, Pessoa dono, String raca) {
	super(nome, dono);
	this.raca = raca;
	}
	

    //getters e setters

    
	@Override
	public void emitirSom(){
		System.out.println("au au");
	}
	
	@Override
	public void obedecerComandos(String comando) {
		System.out.println("cachorro rola, dá a pata, etc");
	}
}
