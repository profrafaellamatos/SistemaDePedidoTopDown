package com.restaurant;

public class ItemDoMenu {
    private String nome;
    private double preco;

    public ItemDoMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
