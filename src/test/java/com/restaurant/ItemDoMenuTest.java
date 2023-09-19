package com.restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDoMenuTest {
    ItemDoMenu itemDoMenu;

    @BeforeEach
    void setUp() {
        itemDoMenu = new ItemDoMenu("Pizza", 20.0);
    }

    @Test
    void getNome() {
        assertEquals("Pizza", itemDoMenu.getNome());
    }

    @Test
    void getPreco() {
        assertEquals(20.0, itemDoMenu.getPreco());
    }
}