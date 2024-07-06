package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends PageBase {

    private WebElement firstNameField;
    private WebElement EmailField;

    private WebElement subjectField;
    private WebElement submitButton;





    public ContactUsPage(WebDriver driver) {
        super(driver);
        firstNameField = driver.findElement(By.xpath("//*[@id=\"FullName\"]"));
        EmailField = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        subjectField = driver.findElement(By.xpath("//*[@id=\"Enquiry\"]"));
        submitButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[2]/button"));


    }

    public void fillContactUSForm(String firstName, String Email, String subject) {
        firstNameField.sendKeys(firstName);
        EmailField.sendKeys(Email);
        subjectField.sendKeys(subject);
    }


    public void clickSubmitButton() {
        submitButton.click();
//        Assert.assertTrue("Registration successful message is displayed", isSuccessMessageDisplayed());

    }

}
