package br.com.unicap.poo;
import java.util.*;

public class Dog extends Animal {

    public Dog (){
        super(12761784L, "Buddy", 1, 2.2, new ArrayList<String>(List.of("sniff")));
    }

    @Override
    public String sound (){
        return "au";
    }
}