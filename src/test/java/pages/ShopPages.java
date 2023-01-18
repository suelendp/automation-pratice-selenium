package pages;

import org.openqa.selenium.By;

public class ShopPages extends BasePage{
    //Locators
    private By menuShopLocator = By.cssSelector("#menu-item-40 > a");
    private By submenuJavascriptLocator = By.cssSelector("#woocommerce_product_categories-2 > ul > li.cat-item.cat-item-21 > a");
    private By nameProductPage = By.tagName("h3");
    public void viewShopPage(){
        if(super.isDisplayed(menuShopLocator)){
            super.actionMoveToElementPerform(menuShopLocator);
            super.actionMoveToElementClickPerform(menuShopLocator);
            super.actionMoveToElementPerform(submenuJavascriptLocator);
            super.actionMoveToElementClickPerform(submenuJavascriptLocator);
        }else {
            System.out.println("menu shop was not found");
        }

    }

    public String getNameProduct(){
        return super.getText(nameProductPage);
    }
}
