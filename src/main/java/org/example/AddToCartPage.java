package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage extends PageBase{
private WebElement select1;

    public AddToCartPage(WebDriver driver) {
        super(driver);
        select1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img"));

    }
    public void clickSelect1(){select1.click();}

    //public void ClickAddButton(){AddToCartButton.click();}
}

