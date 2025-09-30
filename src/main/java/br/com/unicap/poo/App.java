package br.com.unicap.poo;

/**
 * Hello world!
 *
 */
public final class App 
{
    public static void main( String[] args )
    {
       System.out.println("testando");
       Som jbl = new Som ("jbl", "GO 4 Essential", "bluetooth");
       System.out.println("--- Detalhes do Som ---");
       jbl.exibirDetalhes();

       System.out.println("\n=====================================\n");
    
       try{

           Fone lenovo = new Fone ("lenovo", "xt80", "fone de ouvido", "bluetooth");
           lenovo.exibirDetalhes();
       } catch (Exception e) {
        System.out.println("erro " + e.getMessage());
       }

       try {
        Dividir dividi = new Dividir (8, 0);
        dividi.divisao();
       }catch (Exception e) {
        System.out.println(e.getMessage() );
       }

       try {
        Dividir dividi = new Dividir (8, 2);
        System.out.println(dividi.divisao());
       }catch (Exception e) {
        System.out.println(e.getMessage() );
       }

       try {
        Dividir dividi = new Dividir (4, 2);
        System.out.println(dividi.divisao());
       }catch (Exception e) {
        System.out.println(e.getMessage() );
       }
    }
}
