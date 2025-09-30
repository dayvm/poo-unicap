package br.com.unicap.poo;

public class Fone extends Som {
    private String tipo;

    public Fone (String marca, String modelo, String conexao, String tipo) throws Exception{
        
        super(marca, modelo, conexao);
        try{
        if (tipo.equals("bluetooth")){
            throw new Exception("tipo nao pode ser bluetooth");
        }
        this.tipo = tipo;
        }catch (Exception e) {
            System.out.println(e);
        }
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
