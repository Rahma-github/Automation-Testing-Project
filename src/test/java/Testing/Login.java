package Testing;

import org.example.HomePage;
import org.example.LoginPage;
import org.testng.annotations.Test;



public class Login extends TestBase {
    HomePage homePage;
    LoginPage loginPagePage;
//    SigninPage signinPage;

    @Test
    public void loginTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickLoginInButton();
        Thread.sleep(2000);
//        signinPage = new SigninPage(driver);
//        signinPage.clickRegisterLink();
        loginPagePage = new LoginPage(driver);
        loginPagePage.fillLoginForm("rahma@gmail.com","123456789",true);
        Thread.sleep(5000);
        loginPagePage.clickSubmitButton();
        Thread.sleep(2000);
        driver.quit();
    }
}

