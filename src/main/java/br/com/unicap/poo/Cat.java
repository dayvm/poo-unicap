package br.com.unicap.poo;
import java.util.*;

public class Cat extends Animal {
    
    public Cat (){
        super(192671L, "Whiskers", 2, 1.8, new ArrayList<String>(List.of("agility")));
    }

    @Override
    public String sound (){
        return "meow";
    }
}