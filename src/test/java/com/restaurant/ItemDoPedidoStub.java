package com.restaurant;

public class ItemDoPedidoStub extends ItemDoPedido{

    public ItemDoPedidoStub(ItemDoMenu itemDoMenu, int quantidade) {
        super(itemDoMenu, quantidade);
    }



    @Override
    public double calcularPrecoTotalPorItem() {
        // Simulando um valor fixo para o preço total por item
        return 10.0 * getQuantidade();
    }
}
