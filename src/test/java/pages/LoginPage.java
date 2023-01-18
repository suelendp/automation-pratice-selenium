package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    //Locators
    private By emailAddressLocator = By.id("username");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
    private By tagMyAccountLocator = By.tagName("p");
    public void signin(){
        if(super.isDisplayed(emailAddressLocator)){
            super.type("suelenddf@gmail.com", emailAddressLocator);
            super.type("DIO@2023*teste", passwordLocator);
            super.click(submitBtnLocator);
        }else{
            System.out.println("Username textbox was not present");
        }

    }

    public String getMyAccountMessage(){
        return super.getText(tagMyAccountLocator);

    }


}
