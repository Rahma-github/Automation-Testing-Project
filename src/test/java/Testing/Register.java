package Testing;

import org.example.HomePage;
import org.example.RegisterPage;
import org.testng.annotations.Test;



public class Register extends TestBase {
    HomePage homePage;
    RegisterPage registerPage;
//    SigninPage signinPage;

    @Test
    public void loginTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickSignInButton();
        Thread.sleep(2000);

        registerPage = new RegisterPage(driver);
        registerPage.fillRegistrationForm("John","taha","fd@gmail.com","google","123456789","123456789" , true);
        Thread.sleep(5000);
        registerPage.clickSubmitButton();
        Thread.sleep(2000);
        driver.quit();
    }
}

