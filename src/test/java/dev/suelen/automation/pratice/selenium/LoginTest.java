package dev.suelen.automation.pratice.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");

    }

    @AfterEach
    void tearDown() throws Exception {
        driver.quit();
    }


    @Test
    void test() {
        WebElement emailAddressLocator = driver.findElement(By.id("username"));
        emailAddressLocator.sendKeys("suelenddf@gmail.com");

        WebElement passwordElement	= driver.findElement(By.name("password"));
        passwordElement.sendKeys("DIO@2023*teste");

        WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        submitBtnElement.click();

        WebElement tagMyAccount = driver.findElement(By.tagName("p"));
        String textTagP = tagMyAccount.getText();

        Assertions.assertTrue(textTagP.contains("Hello"));
    }



}
