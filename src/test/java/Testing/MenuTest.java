package Testing;
import org.example.HomePage;
import org.example.MenuPage;
import org.testng.annotations.Test;

public class MenuTest extends TestBase{
    HomePage homePage;
    MenuPage menu;

    @Test
    public void loginTest() throws InterruptedException {
        menu = new MenuPage(driver);
        menu.clickNote();
        Thread.sleep(2000);
        driver.quit();
    }
}
