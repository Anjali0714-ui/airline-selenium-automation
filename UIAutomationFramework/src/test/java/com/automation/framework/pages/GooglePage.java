package com.automation.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    private WebDriver driver;
    private By searchBox = By.name("q");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogle() {
        driver.get("https://www.google.com");
    }

    public void search(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchBox).submit();
    }
}