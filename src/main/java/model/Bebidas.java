package model;

public class Bebidas implements ItemCombo {
    private final String nome;
    private final double preco;

    public Bebidas(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override public String getNome() { return nome; }
    @Override public double getPreco() { return preco; }
    @Override public String toString() { return nome + " (R$" + preco + ")"; }

    public static Bebidas cola() { return new Bebidas("Coca-Cola 300ml", 5.00); }
    public static Bebidas sucoLaranja() { return new Bebidas("Suco de Laranja 300ml", 6.00); }
    public static Bebidas sucoVerde() { return new Bebidas("Suco Verde 300ml", 6.50); }
    public static Bebidas agua() { return new Bebidas("Água Mineral 500ml", 4.00); }
}