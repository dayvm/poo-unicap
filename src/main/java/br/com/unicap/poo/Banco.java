package br.com.unicap.poo;

public class Banco {

    private Cliente[] clientes = new Cliente[2];

    public Cliente[] getClientes() {
        return clientes;
    }

    public Cliente[] cadastraClientes() {
  
        Cliente c1 = new Cliente("Alan Turing", "1289", 1500, 25896);

    
        Cliente c2 = new Cliente("Ada Love", "98765431", 12345);

        this.clientes[0] = c1;
        this.clientes[1] = c2;

        System.out.println("Clientes cadastrados com sucesso!");
        return this.clientes;
    }

    public String operacoes() {
        System.out.println("\nIniciando operações...");
       
        Cliente cliente1 = this.clientes[0];
        Cliente cliente2 = this.clientes[1];

        
        cliente1.saque(100);
        cliente2.saque(100);

        
        cliente1.deposito(50);
        cliente2.deposito(50);

        if (cliente1.extrato() < 0) {
            cliente1.setSaldo(0);
        }
        if (cliente2.extrato() < 0) {
            cliente2.setSaldo(0);
        }

        cliente2.setNome("Ada Lovelace");

        cliente1.setCpf("12345689");
        
        System.out.println("Operações concluídas!");

        return cliente1.toString() + "\n\n" + cliente2.toString(); // Adicionei \n extra para melhor legibilidade
    }
}
