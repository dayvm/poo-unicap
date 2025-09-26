// Arquivo: LocadoraEstoque.java
package br.com.unicap.poo;

public class LocadoraEstoque {

    public static void main(String[] args) {
        // 1. Criando uma instância da Locadora
        Locadora minhaLocadora = new Locadora("Cine Unicap");
        System.out.println("Bem-vindo à " + minhaLocadora.nome + "!");

        // 2. Criando pelo menos três filmes usando os dois construtores
        
        // Usando o construtor completo (título, gênero, ano)
        Filme filme1 = new Filme("Duna: Parte Dois", "Ficção Científica", 2024);
        Filme filme2 = new Filme("Oppenheimer", "Drama Histórico", 2023);

        // Usando o construtor sobrecarregado (título, gênero)
        Filme filme3 = new Filme("O Resgate do Soldado Ryan", "Guerra");

        // 3. Cadastrando os filmes na locadora
        System.out.println(); // Apenas para pular uma linha
        minhaLocadora.adicionarFilme(filme1);
        minhaLocadora.adicionarFilme(filme2);
        minhaLocadora.adicionarFilme(filme3);

        // 4. Exibindo a lista de filmes cadastrados
        minhaLocadora.listarFilmes();
    }
}