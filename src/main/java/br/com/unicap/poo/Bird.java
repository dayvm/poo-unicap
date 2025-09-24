package br.com.unicap.poo;
import java.util.*;

public class Bird extends Animal {

    public Bird (){
        super(49876573L, "Tweety", 1, 0.7, new ArrayList<String>(List.of("fly")));
    }

    @Override
    public String sound (){
        return "piu";
    }
}