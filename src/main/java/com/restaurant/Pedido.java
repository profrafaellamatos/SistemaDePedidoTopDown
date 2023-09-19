package com.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemDoPedido> itens = new ArrayList<>();

    public Pedido(List<ItemDoPedido> itens) {
        this.itens = itens;
    }

    public List<ItemDoPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemDoPedido item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemDoPedido item : itens) {
            total += item.calcularPrecoTotalPorItem();
        }
        return total;
    }


}
