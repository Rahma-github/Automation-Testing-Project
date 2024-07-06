package Testing;

import org.example.AddToCartPage;
import org.example.HomePage;
import org.testng.annotations.Test;

public class AddToCart extends TestBase{
    HomePage homePage;
    AddToCartPage addtocart;
    test0 test;
    @Test
     public void loginTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.SelectCategory();
        Thread.sleep(5000);
        addtocart = new AddToCartPage(driver);
        addtocart.clickSelect1();
        Thread.sleep(5000);
        test = new test0(driver);
        test.ClickAddButton();
        Thread.sleep(5000);

        driver.quit();
    }
}