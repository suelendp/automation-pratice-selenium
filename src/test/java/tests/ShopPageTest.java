package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ShopPages;

class ShopPageTest {

    private ShopPages shopPages;
    private final String URL = "https://practice.automationtesting.in/";

    @BeforeEach
    void setUp() throws Exception {
        this.shopPages = new ShopPages();
        this.shopPages.visit(this.URL);
    }

    @AfterEach
    void tearDown() throws Exception {
        //this.shopPages.quitWebDriver();
    }

    @Test
    void test() {
        //when
        this.shopPages.viewShopPage();

        //then
        Assertions.assertEquals("Functional Programming in JS", this.shopPages.getNameProduct());

    }

}