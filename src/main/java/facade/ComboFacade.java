package facade;

import model.*;

public class ComboFacade {
    private Combos combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combos(Bugers.comboMaster(), Bebidas.cola(), Sobremesas.sorvete());
                break;
            case 2:
                combo = new Combos(Bugers.superBurger(), Bebidas.sucoLaranja(), Sobremesas.brownie());
                break;
            case 3:
                combo = new Combos(Bugers.comboMaster(), Bebidas.sucoLaranja(), Sobremesas.frutaEstacao());
                break;
            case 4:
                combo = new Combos(Bugers.superBurger(), Bebidas.cola(), Sobremesas.brownie());
                break;
            case 5:
                combo = new Combos(Bugers.veggie(), Bebidas.sucoVerde(), Sobremesas.frutaEstacao());
                break;
            case 6:
                combo = new Combos(Bugers.mini(), Bebidas.agua(), Sobremesas.cookie());
                break;
            default:
                throw new IllegalArgumentException("Código de combo inválido.");
        }
    }

    public void exibirItens() {
        System.out.println("Itens do Combo:");
        System.out.println("- " + combo.getBurger());
        System.out.println("- " + combo.getBebida());
        System.out.println("- " + combo.getSobremesa());
    }

    public double getPrecoTotal() {
        return combo.getBurger().getPreco()
                + combo.getBebida().getPreco()
                + combo.getSobremesa().getPreco();
    }
}