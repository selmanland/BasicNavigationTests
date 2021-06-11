package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHomework {
    public static void main(String[] args) {

        // Test case 1

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.ebay.nl/");

        WebElement inputButton = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
        inputButton.sendKeys("search");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        
        WebElement searchResult = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
        System.out.println("searchResult.getText() = " + searchResult.getText());
        driver.close();

        // Test case 2
        WebDriver driver1 = BrowserFactory.getDriver("chrome");
        driver1.get("https://www.ebay.nl/");

        WebElement inputButton1 = driver1.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
        inputButton1.sendKeys("selenium");

        WebElement searchButton1 = driver1.findElement(By.xpath("//input[@type='submit']"));
        searchButton1.click();

        System.out.println("driver1.getTitle() = " + driver1.getTitle());
        driver1.close();

        // Test case 3
        WebDriver driver2 = BrowserFactory.getDriver("chrome");
        driver2.get("https://www.wikipedia.org/");

        WebElement inputButton2 = driver2.findElement(By.id("searchInput"));
        inputButton2.sendKeys("selenium webdriver");

        WebElement searchButton2 = driver2.findElement(By.xpath("//button/i[1]"));
        searchButton2.click();

        WebElement link = driver2.findElement(By.xpath("//a[@href='/wiki/Selenium_(software)']"));
        link.click();
        System.out.println("driver2.getCurrentUrl() = " + driver2.getCurrentUrl());

        driver2.close();

    }
}
