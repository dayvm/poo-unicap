// Arquivo: Locadora.java
package br.com.unicap.poo;

import java.util.ArrayList;
import java.util.List; // É uma boa prática usar a Interface List

public class Locadora {
    private String nome;
    private List<Filme> filmes;

    // Construtor da Locadora
    public Locadora(String nome) {
        this.nome = nome;
        // Inicializa a lista de filmes como uma lista vazia
        this.filmes = new ArrayList<>();
    }

    /**
     * Adiciona um objeto Filme à lista de filmes da locadora.
     * @param filme O filme a ser adicionado.
     */
    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
        System.out.println("Filme '" + filme.getTitulo() + "' adicionado ao catálogo.");
    }

    /**
     * Imprime no console a lista de todos os filmes cadastrados.
     */
    public void listarFilmes() {
        System.out.println("\n--- Catálogo de Filmes da Locadora: " + this.nome + " ---");
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado no momento.");
        } else {
            // Percorre a lista de filmes e imprime cada um
            // Java chama automaticamente o método toString() de cada objeto 'filme'
            for (Filme filme : this.filmes) {
                System.out.println(filme.toString());
            }
        }
        System.out.println("-------------------------------------------------");
    }
}