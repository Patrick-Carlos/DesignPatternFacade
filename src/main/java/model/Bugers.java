package model;

public class Bugers implements ItemCombo {
    private final String nome;
    private final double preco;

    public Bugers(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override public String getNome() { return nome; }
    @Override public double getPreco() { return preco; }
    @Override public String toString() { return nome + " (R$" + preco + ")"; }

    // Métodos de fábrica para burgers comuns
    public static Bugers comboMaster() { return new Bugers("Master Burger", 15.00); }
    public static Bugers superBurger() { return new Bugers("Super Burger", 12.50); }
    public static Bugers veggie() { return new Bugers("Veggie Burger", 14.00); }
    public static Bugers mini() { return new Bugers("Mini Burger", 9.00); }
}