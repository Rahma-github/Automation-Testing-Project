package Testing;

import org.example.ContactUsPage;
import org.example.HomePage;
import org.testng.annotations.Test;


public class ContactUs extends TestBase {
    HomePage homePage;
    ContactUsPage contactusPage;
//    SigninPage signinPage;

    @Test
    public void loginTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickContactUsButton();
        Thread.sleep(2000);

        contactusPage = new ContactUsPage(driver);
        contactusPage.fillContactUSForm("John","taha@gmail.com","klhuyhvvtgcrrxr");
        Thread.sleep(2000);
        contactusPage.clickSubmitButton();
        Thread.sleep(2000);
        driver.quit();
    }
}

