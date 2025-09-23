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

       Fone lenovo = new Fone ("lenovo", "xt80", "fone de ouvido", "bluetooth");
       lenovo.exibirDetalhes();
    }
}
