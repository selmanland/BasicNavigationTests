package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHomework2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeButton = driver.findElement(By.xpath("//li/a[@class='nav-link'][1]"));
        homeButton.click();
        Thread.sleep(2000);
        driver.navigate().back();

        WebElement header = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        System.out.println("header.getText() = " + header.getText());

        WebElement emailHeader = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println("emailHeader.getText() = " + emailHeader.getText());

        WebElement input = driver.findElement(By.xpath("//label[@for='email']/following-sibling::*")); ////label[@for='email']/../input

        WebElement ret = driver.findElement(By.xpath("//i[.='Retrieve password']"));
        System.out.println("ret.getText() = " + ret.getText());

    }
}
