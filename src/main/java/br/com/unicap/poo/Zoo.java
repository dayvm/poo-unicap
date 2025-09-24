package br.com.unicap.poo;
import java.util.*;


public class Zoo {
    public ArrayList<Animal> animals;

    public Zoo(){
        this.animals = new ArrayList<>();
    }

    public void addAnimal (Animal animal) {
        this.animals.add(animal);
    }

    public ArrayList<Animal> listAnimals(){
        return this.animals;
    }

    public boolean removeAnimals (long id){
        Iterator<Animal> iterator = animals.iterator();

        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if (animal.id == id){
                iterator.remove();
                System.out.println("Animal with ID " + id + " has been removed.");
                return true;
            }
        }
        return false;
    }
}
