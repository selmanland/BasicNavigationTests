package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.vandale.nl/");
        Thread.sleep(4000);
        driver.close();

        WebDriver driver1 = BrowserFactory.getDriver("firefox");
        driver1.get("https://www.vandale.nl/");
        driver1.close();

        WebDriver driver2 = BrowserFactory.getDriver("edge");
        driver2.get("https://www.vandale.nl/");
        driver1.close();


    }
}
