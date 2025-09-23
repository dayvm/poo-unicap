package br.com.unicap.poo;

public class Som {
    protected String marca;
    protected String modelo;
    protected String conexao;

    public Som (String marca, String modelo, String conexao) {
        this.marca = marca;
        this.modelo = modelo;
        this.conexao = conexao;
    }

    public void exibirDetalhes() {
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("conexao: " + this.conexao);
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getConexao(){
        return this.conexao;
    }
}
