package br.com.unicap.poo;

public abstract class Pet implements ComportamentoAnimal{
private int id;
private String nome;
private Pessoa dono;

public Pet(String nome, Pessoa dono) {
    this.id = 1;
    this.nome = nome;
    this.dono = dono;
}

// getters e setters

@Override
public abstract void emitirSom ();

@Override
public abstract void obedecerComandos(String comando);

}