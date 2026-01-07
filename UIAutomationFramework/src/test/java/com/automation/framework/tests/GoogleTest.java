package com.automation.framework.tests;


import com.automation.framework.base.BaseTest;
import com.automation.framework.pages.GooglePage;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        GooglePage google = new GooglePage(driver);
        google.openGoogle();
        google.search("Automation Testing");
        System.out.println("Title is: " + driver.getTitle());
    }
}
