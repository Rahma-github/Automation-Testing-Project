package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MenuPage extends PageBase {

    public MenuPage(WebDriver driver) {
        super(driver);

    }

    public void clickNote() {

        Select dropdown = new Select(driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(1) > a")));
        dropdown.selectByIndex(0);

    }


}
