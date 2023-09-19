package com.restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    ItemDoMenuStub itemDoMenuPizzaStub;
    ItemDoMenuStub itemDoMenuRefriStub;
    ItemDoPedidoStub itemDoPedidoPizzaStub;
    ItemDoPedidoStub itemDoPedidoRefriStub;
    Pedido pedido;

    @BeforeEach
    void setUp(){
        itemDoMenuPizzaStub = new ItemDoMenuStub("Pizza", 20.0);
        itemDoMenuRefriStub = new ItemDoMenuStub("Refrigerante", 7.0);
        itemDoPedidoPizzaStub = new ItemDoPedidoStub(itemDoMenuPizzaStub, 1);
        itemDoPedidoRefriStub = new ItemDoPedidoStub(itemDoMenuRefriStub, 2);
        pedido = new Pedido(new ArrayList<>());
    }

    @Test
    void adicionarItensTest(){
        pedido.adicionarItem(itemDoPedidoPizzaStub);
        List<ItemDoPedido> itensDoPedido = pedido.getItens();
        assertEquals(1, itensDoPedido.size());
        assertTrue(itensDoPedido.contains(itemDoPedidoPizzaStub));
    }


    @Test
    void calcularTotalTest(){
        pedido.adicionarItem(itemDoPedidoPizzaStub);
        pedido.adicionarItem(itemDoPedidoRefriStub);
        List<ItemDoPedido> itensDoPedido = pedido.getItens();

        double total = pedido.calcularTotal();

        assertEquals(2, itensDoPedido.size());
        assertTrue(itensDoPedido.contains(itemDoPedidoPizzaStub));
        assertTrue(itensDoPedido.contains(itemDoPedidoRefriStub));
        assertEquals(30.0, total, 0.01);
    }



    /*
    // Chame o método calcularPrecoTotalPorItem()
    double precoTotal = itemDoPedidoPizza.calcularPrecoTotalPorItem();

    // Verifique se o resultado é o esperado (12.0 * 2 = 24.0)

    assertEquals(20.0, precoTotal, 0.01); // Use uma margem de erro pequena (0.01) para lidar com possíveis arredondamentos
*/
}