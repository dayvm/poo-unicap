package br.com.unicap.poo;
import java.util.*;

public final class App 
{
    public static void main( String[] args )
    {
      Zoo zoo = new Zoo();
      Scanner sc = new Scanner(System.in);
      int escolhaMenu;

      do {
          System.out.println ("Menu");
          System.out.println ("1 - Adicionar animal");
          System.out.println ("2 - Listar todos os animais");
          System.out.println ("3 - Remover animal (por id)");
          System.out.println ("4 - Emitir som de um animal (por id)");
          System.out.println ("5 - Testar habilidade de um animal (por id)");
          System.out.println ("6 - Sair do programa");

          escolhaMenu = sc.nextInt();

          switch (escolhaMenu) {
            case 1:
              try{
                System.out.println("Qual animal você quer adicionar?");
                System.out.println("1 - Cat");
                System.out.println("2 - Dog");
                System.out.println("3 - Bird");

                int escolhaAnimal = sc.nextInt();
                Animal novoAnimal = null;

                switch (escolhaAnimal){
                  case 1:
                    novoAnimal = new Cat();
                    System.out.println ("Gato escolhido");
                    break;
                  case 2:
                    novoAnimal = new Dog();
                    System.out.println ("Cachorro escolhido");
                    break;
                  case 3:
                    novoAnimal = new Bird();
                    System.out.println ("Pássaro escolhido");
                    break;
                }

                zoo.addAnimal(novoAnimal);
                System.out.println ("Animal adicionado");
                break;
              }  catch (Exception e) {
                  System.out.println("Erro: " + e);
                }
            case 2:
                try {
                  zoo.printAnimals();
                  break;
                } catch (Exception e) {
                  System.out.println("Erro: " + e);
                }
            case 3:
                try {
                  System.out.println("Qual animal você quer remover? Insira o id correspondente");
                  zoo.printAnimals();
                  Long idAnimal = sc.nextLong();
                  zoo.removeAnimals(idAnimal);
                } catch (Exception e) {
                  System.out.println("Erro: " + e);
                }
                break;
            case 4:
                try {
                  System.out.println("Qual animal você quer que faça o som? Insira o id correspondente");
                  zoo.printAnimals();
                  Long idAnimal = sc.nextLong();
                  Animal animal = zoo.returnAnimal(idAnimal);
                  System.out.println(animal.sound());
                } catch (Exception e) {
                  System.out.println("Erro: " + e);
                }
                break;
            case 5:
                try {
                  System.out.println("Qual animal você quer consultar habilidades? Insira o id correspondente");
                  zoo.printAnimals();
                  Long idAnimal = sc.nextLong();
                  Animal animal = zoo.returnAnimal(idAnimal);
                  System.out.println("Qual habilidade você quer saber se o animal possui?");
                  String habilidade = sc.next();
                  System.out.println(animal.performAbility((habilidade)));
                } catch (Exception e) {
                  System.out.println("Erro: " + e);
                }
                break;
            case 6:
                System.out.println("Programa encerrado");
                
          }
      } while (escolhaMenu != 6);

    }
}
