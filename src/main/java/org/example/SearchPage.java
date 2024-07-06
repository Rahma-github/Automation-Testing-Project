package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends PageBase {
    private WebElement ProductName;
    private WebElement submitButton;



//    @FindBy(xpath = "//*[@id=\"small-searchterms\"]")
//    private WebElement searchInput;
//
//    @FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
//    private WebElement searchButton;
//
//    @FindBy(className = "product-title")
//    private WebElement productTitle;

    public SearchPage(WebDriver driver) {
        super(driver);
        ProductName = driver.findElement(By.cssSelector("#small-searchterms"));
        submitButton = driver.findElement(By.cssSelector("#small-search-box-form > button"));

    }

    public void SearcProduct(String productname ) {

        ProductName.sendKeys(productname);
        submitButton.click();





    }

    public void clickSubmitButton() {
        submitButton.click();
//        Assert.assertTrue("Registration successful message is displayed", isSuccessMessageDisplayed());

    }


}
