package br.com.unicap.poo;

public class Fone extends Som {
    private String tipo;

    public Fone (String marca, String modelo, String tipo, String conexao){
        super(marca, modelo, conexao);
        this.tipo = tipo;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println ("método atualizado: exibindo novos detalhes de FONE");
        super.exibirDetalhes();
        System.out.println("tipo: " + this.tipo);
    }

    public String getConexao (){
        return this.conexao;
    }
}
