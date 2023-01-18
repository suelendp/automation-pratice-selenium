package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    //Locators
    private By nameLocator = By.name("name");
    private By emailAddressLocator = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");

    private By submitBtnLocator = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    private By emailLocator = By.id("email");
    private By alertAdditionalInformationLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/p[4]/label/span");


    public void insertEmailToRegister(){
        if (super.isDisplayed((emailAddressLocator))) {
            type("Suelen",nameLocator);
            type("sdiaspalhares@gmail.com", emailAddressLocator);
            click(submitBtnLocator);
        }else {
            System.out.println("email textbox was not present");
        }
    }
    public String getEmailNewAccount(){
        super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
        return super.getTextByAttribute(this.emailLocator,"value");


    }
}
