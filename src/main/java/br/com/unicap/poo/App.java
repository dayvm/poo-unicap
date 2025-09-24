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

                
                
                
          }
      } while (escolhaMenu != 6);

    }
}
