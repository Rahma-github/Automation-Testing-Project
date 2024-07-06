package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class LoginPage {

    private WebElement EmailInput;
    private WebElement passwordInput;

    private WebElement RememberType;

    private WebElement submitButton;




    public LoginPage(WebDriver driver) {
//        super(driver);

        EmailInput = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

        passwordInput = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        RememberType = driver.findElement(By.xpath("//*[@id=\"RememberMe\"]"));


        submitButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }

    public void fillLoginForm(String Email , String password , boolean remember ) {

        EmailInput.sendKeys(Email);
        passwordInput.sendKeys(password);
        RememberType.click();



    }



    public void clickSubmitButton() {
        submitButton.click();
//        Assert.assertTrue("Registration successful message is displayed", isSuccessMessageDisplayed());

    }
//
//    private boolean isSuccessMessageDisplayed() {
//        // Implement logic to check if the success message is displayed on the page
//        // For demonstration purposes, let's assume the success message is displayed in an element with id "successMessage"
//        return driver.findElement(By.id("successMessage")).isDisplayed();
//    }
}



