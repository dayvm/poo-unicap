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

    public void printAnimals(){
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
                  Animal animal = iterator.next();
                  animal.listAnimal();
                }
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

    public Animal returnAnimal (long id){
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if (animal.id == id){
                return animal;
            }
        }
        throw new NoSuchElementException("Animal com ID " + id + " não encontrado.");
    }
}
