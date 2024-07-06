package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;




import java.time.Duration;
import java.util.List;

public class HomePage extends PageBase {


    @FindBy(className = "ico-register")
    private WebElement signInButton;

    @FindBy(className = "ico-login")
    private WebElement LoginInButton;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a")
    private WebElement contactUsButton;

    @FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"small-searchterms\"]")
    private WebElement searchInput;
    @FindBy (xpath = "//*[@id=\"main\"]/div/div/div/div/div[3]/div/div[1]/div/div/a/img")
    private WebElement selectedcategory;






//
//    WebElement computersMenu;
//    @FindBy(linkText = "Notebooks")
//    WebElement notebooksMenu;
//    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
//
//    public WebElement notebookHeadLine;
    private Actions action;

//    @FindBy(css = "select[data-test='sort']")
//    private WebElement sortDropdown;
//
//    @FindBy(xpath = "//*[@id='search-query']")
//    private WebElement searchInput;
//
//    @FindBy(xpath = "//*[@id='filters']/form[2]/div/button[2]")
//    private WebElement searchButton;
//
//    @FindBy (xpath = "/html/body/app-root/div/app-overview/div/a[2]")
//    private WebElement ProfileButton;

    public HomePage(WebDriver driver) {
        super(driver);

    }

    public void clickSignInButton() {
        signInButton.click();
    }
    public void clickLoginInButton() {
        LoginInButton.click();
    }
    public void clickContactUsButton() {contactUsButton.click();}

//    public void clickElectronicButton() {computersMenu.click();}

    public void clickSearchButton(String searchTerm) {

    }

    public void SelectCategory(){selectedcategory.click();}

//    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")

    }

//    public void ClickProfile(){ProfileButton.click();}
//
//    public void selectSortOption(String option) {
//        Select sortSelect = new Select(sortDropdown);
//        sortSelect.selectByVisibleText(option);
//    }
//
//    public void sortByNameAsc() {
//        selectSortOption("Name (A - Z)");
//    }
//
//    public void sortByNameDesc() {
//        selectSortOption("Name (Z - A)");
//    }
//
//    public void sortByPriceHighToLow() {
//        selectSortOption("Price (High - Low)");
//    }
//
//    public void sortByPriceLowToHigh() {
//        selectSortOption("Price (Low - High)");
//    }
//
//    public void clickCheckboxByXPath(WebDriver driver, String checkboxName) {
//        WebElement checkbox = new WebDriverWait(driver, Duration.ofSeconds(7))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), '" + checkboxName + "')]/input[@type='checkbox']")));
//
//        checkbox.click();
//    }
//
//    public void clickOnCardByName(WebDriver driver, String cardName) {
//        WebElement card = driver.findElement(By.xpath("//h5[contains(text(), '" + cardName + "')]"));
//        card.click();
//    }
//    public void clickOnPageNumber(WebDriver driver, int pageNumber) {
//        WebElement pageLink = driver.findElement(By.xpath("//a[contains(text(), '" + pageNumber + "')]"));
//        pageLink.click();
//    }
//    public void search(String searchTerm) {
//        searchInput.sendKeys(searchTerm);
//        searchButton.click();
//    }











