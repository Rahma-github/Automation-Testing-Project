package Testing;

import org.example.HomePage;
import org.example.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    String productName = "Nikon D5500 DSLR";
    SearchPage searchpage;
    HomePage homePage;

    @Test
    public void search() throws InterruptedException {
        searchpage = new SearchPage(driver);
        homePage = new HomePage(driver);
        homePage.clickSearchButton(productName);
        Thread.sleep(2000);

        searchpage = new SearchPage(driver);
        searchpage.SearcProduct(productName);
        Thread.sleep(5000);
        // Modify this part of the code to handle StaleElementReferenceException
        try {
            searchpage.clickSubmitButton();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            // If StaleElementReferenceException occurs, re-find the element and try again
            searchpage = new SearchPage(driver);
            searchpage.clickSubmitButton();
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
