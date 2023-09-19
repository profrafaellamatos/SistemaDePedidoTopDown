package com.restaurant;

public class ItemDoPedido {
    private ItemDoMenu itemDoMenu;
    private int quantidade;

    public ItemDoPedido(ItemDoMenu itemDoMenu, int quantidade) {
        this.itemDoMenu = itemDoMenu;
        this.quantidade = quantidade;
    }


    public ItemDoMenu getItemDoMenu() {
        return itemDoMenu;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularPrecoTotalPorItem(){
        return 0;
    }
}
