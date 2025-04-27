package model;

public class Sobremesas implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesas(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override public String getNome() { return nome; }
    @Override public double getPreco() { return preco; }
    @Override public String toString() { return nome + " (R$" + preco + ")"; }

    // Métodos de fábrica para sobremesas comuns
    public static Sobremesas sorvete() { return new Sobremesas("Sorvete Milkshake", 7.00); }
    public static Sobremesas brownie() { return new Sobremesas("Brownie com Sorvete", 8.50); }
    public static Sobremesas frutaEstacao() { return new Sobremesas("Fruta da Estação", 5.00); }
    public static Sobremesas cookie() { return new Sobremesas("Cookie Doce", 3.50); }
}