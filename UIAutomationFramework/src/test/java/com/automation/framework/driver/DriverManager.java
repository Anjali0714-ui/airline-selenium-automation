package com.automation.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * DriverManager handles WebDriver initialization and quitting.
 * Uses WebDriverManager to automatically manage driver binaries.
 */
public class DriverManager {

    private static WebDriver driver;

    // Returns the WebDriver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            // Setup ChromeDriver automatically
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    // Quits the WebDriver and sets it to null
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}