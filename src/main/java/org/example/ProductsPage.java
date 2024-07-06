package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends PageBase {

    @FindBy(id = "btn-increase-quantity")
    private WebElement increment;
    @FindBy(id = "quantity-input")
    private WebElement quantityInput;
    @FindBy(xpath = "//*[@id='btn-add-to-cart']/i")
    private WebElement addToCartButton;
    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[5]/a")
    private WebElement Cart;

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void increaseQuantity() {
        increment.click();
    }
    public void setQuantity(int quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity));
    }
    public void clickAddToCart() {
        addToCartButton.click();
    }
    public void Cart() {
        Cart.click();
    }
}
