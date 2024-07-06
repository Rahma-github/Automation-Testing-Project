package Testing;

import org.example.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test0 extends PageBase {
    private WebElement select2;
    private WebElement AddToCartButton;
    public test0(WebDriver driver) {
        super(driver);
        AddToCartButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]"));
    }

    public void ClickAddButton(){AddToCartButton.click();}
}
