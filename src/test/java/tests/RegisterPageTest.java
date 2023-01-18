package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegisterPage;

class RegisterPageTest {
    private RegisterPage registerPage;
    private final String URL = "https://automationexercise.com/signup";

    @BeforeEach
    void setUp() throws Exception {
        this.registerPage = new RegisterPage();
        this.registerPage.visit(this.URL);
    }

    @AfterEach
    void tearDown() throws Exception {
       // this.registerPage.quitWebDriver();
    }

    @Test
    void test() {
        //when
        this.registerPage.insertEmailToRegister();

        //then
        String expected = "sdiaspalhares@gmail.com";
        String actual = this.registerPage.getEmailNewAccount();
        Assertions.assertEquals(expected, actual);
    }

}