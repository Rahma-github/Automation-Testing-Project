package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EditProfilePage extends PageBase{

    private WebElement FirstName;
    private WebElement LastName;
    private WebElement Phone;
    private WebElement UpdateButton;

    public EditProfilePage(WebDriver driver) {
        super(driver);
        FirstName = driver.findElement(By.id("first_name"));
        LastName = driver.findElement(By.id("last_name"));
        Phone = driver.findElement(By.id("phone"));
        UpdateButton = driver.findElement(By.xpath("/html/body/app-root/div/app-profile/div/form[1]/div[3]/div/button"));
    }

    public void EditDetails (String newfirst, String newsecond,String newphone){
        FirstName.clear();
        FirstName.sendKeys(newfirst);
        LastName.clear();
        LastName.sendKeys(newsecond);
        Phone.clear();
        Phone.sendKeys(newphone);


    }

    public void clickUpdateButton() {
        UpdateButton.click();
    }
}
