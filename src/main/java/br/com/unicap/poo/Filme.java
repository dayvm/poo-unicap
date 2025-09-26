// Arquivo: Filme.java
package br.com.unicap.poo;

public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    // Construtor principal com todos os atributos
    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    // Segundo construtor (sobrecarga) que define um valor padrão para o ano
    public Filme(String titulo, String genero) {
        // Chama o construtor principal, passando 0 como valor padrão para o ano
        this(titulo, genero, 0);
    }

    // --- MÉTODOS GETTERS ---
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getGenero() {
        return this.genero;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    // --- MÉTODOS SETTERS ---
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    // --- MÉTODO TOSTRING ---
    @Override
    public String toString() {
        return "Filme: '" + titulo + "', Gênero: " + genero + ", Ano: " + (anoLancamento == 0 ? "Indefinido" : anoLancamento);
    }
}