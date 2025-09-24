package br.com.unicap.poo;
import java.util.ArrayList;

public class Animal {
    protected long id;
    protected String name;
    protected int age;
    protected double weight;
    protected ArrayList<String> abilities;
    
    
    public Animal (long id, String name, int age, double weight, ArrayList<String> abilities){]
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.abilities = abilities;
    }

    public void exibirDetalhes() {
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("conexao: " + this.conexao);
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getConexao(){
        return this.conexao;
    }
}
