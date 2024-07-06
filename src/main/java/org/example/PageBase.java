package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    public WebDriver driver;
    public Select select;
    public Actions act;
    WebDriverWait wait;
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



}
