package com.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import facade.ComboFacade;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ComboFacade facade = new ComboFacade();
        List<Integer> pedidos = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("=== Menu de Combos ===");
            System.out.println("1 – Combo Master");
            System.out.println("2 – Super Combo");
            System.out.println("3 – Combo Tropical");
            System.out.println("4 – Combo Chocomania");
            System.out.println("5 – Combo Veggie");
            System.out.println("6 – Combo MiniFeliz");
            System.out.println("7 – Finalizar pedido");
            System.out.print("Sua escolha: ");
            int escolha = in.nextInt();

            if (escolha == 7) {
                running = false;
                break;
            }

            try {
                facade.criarCombo(escolha);
            } catch (IllegalArgumentException e) {
                System.out.println("\nOpção inválida. Escolha um combo válido, ou finalize seu pedido!\n");
                continue;
            }

            facade.exibirItens();
            pedidos.add(escolha);
            System.out.println("\nCombo adicionado ao pedido!\n");
            System.out.println("\nEscolha outro combo ou finalize o pedido!\n");
        }

        if (pedidos.isEmpty()) {
            System.out.println("Nenhum combo selecionado. Encerrando.");
        } else {
            System.out.println("\n=== Resumo do Pedido ===");
            double totalGeral = 0;
            for (int codigo : pedidos) {
                facade.criarCombo(codigo);
                facade.exibirItens();
                totalGeral += facade.getPrecoTotal();
                System.out.println();
            }
            System.out.printf("Total Geral: R$ %.2f%n", totalGeral);
            System.out.println("Pedido concluído. Obrigado!");
        }
        in.close();
    }
}