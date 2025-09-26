package br.com.unicap.poo;

public class Cliente {

    private String nome;
    private String cpf;
    private int saldo;
    private int numConta;


    public Cliente(String nome, String cpf, int saldo, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numConta = numConta;
    }


    public Cliente(String nome, String cpf, int numConta) {
        this(nome, cpf, 0, numConta);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
   
    public int extrato() {
        return this.saldo;
    }

    public void saque(int val) {
        this.saldo -= val; // this.saldo = this.saldo - val;
    }

   
    public void deposito(int val) {
        this.saldo += val; // this.saldo = this.saldo + val;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome + "\nCPF: " + this.cpf + "\nConta: " + this.numConta + "\nSaldo: " + this.saldo;
    }
}