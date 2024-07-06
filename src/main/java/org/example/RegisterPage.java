package org.example;
//import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {

    private WebElement firstNameInput;
    private WebElement lastNameInput;
    private WebElement genderType;

    private WebElement Day;
    private WebElement EmailInput;
    private WebElement companyNAme;
    private WebElement passwordInput;
    private WebElement confirmPasswordInput;
    private WebElement dayDropdown;
    private WebElement monthDropdown;

    private WebElement yearDropdown;
    private WebElement submitButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
        firstNameInput = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
        lastNameInput = driver.findElement(By.id("LastName"));
        EmailInput = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        genderType = driver.findElement(By.xpath("//*[@id=\"gender\"]/span[1]/label"));
        companyNAme = driver.findElement(By.xpath("//*[@id=\"Company\"]"));
        passwordInput = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        confirmPasswordInput = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
        genderType = driver.findElement(By.xpath("//*[@id=\"gender\"]/span[1]/label"));

        dayDropdown = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
        monthDropdown   = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
        yearDropdown   = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));

        submitButton = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
    }

    public void fillRegistrationForm(String firstName,String lastName,String Email , String company , String password , String confirnPAssword , boolean gender ) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        EmailInput.sendKeys(Email);
        companyNAme.sendKeys(company);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(confirnPAssword);
        genderType.click();


        Select dayDropdownSelect = new Select(dayDropdown);
        dayDropdownSelect.selectByIndex(6);

        Select monthDropdownSelect = new Select(monthDropdown);
        monthDropdownSelect.selectByVisibleText("April");
        Select yearDropdownSelect = new Select(yearDropdown);
        yearDropdownSelect.selectByVisibleText("2000");

    }
//        cityInput.sendKeys(city);
//        stateInput.sendKeys(state);
//        countrySelect.sendKeys(country);
//        phoneInput.sendKeys(phone);
//        emailInput.sendKeys(email);
//        passwordInput.sendKeys(password);


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
