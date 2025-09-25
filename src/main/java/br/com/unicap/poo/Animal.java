package br.com.unicap.poo;
import java.util.*;

public abstract class Animal {
    protected long id;
    protected String name;
    protected int age;
    protected double weight;
    protected ArrayList<String> abilities;
    
    
    public Animal (long id, String name, int age, double weight, ArrayList<String> abilities){
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.abilities = abilities;
    }

    public abstract String sound ();

    public String performAbility (String ability) {
        if (abilities.contains(ability)){
            return (name + " can " + ability);
        } else {
            return (name + " can't " + ability);
        }
    }

    public void listAnimal () {
        System.out.println ("id: " + this.id + ", nome: " + this.name);
    }
}
