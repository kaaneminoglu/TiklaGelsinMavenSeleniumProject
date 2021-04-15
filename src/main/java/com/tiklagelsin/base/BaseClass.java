package com.tiklagelsin.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    public static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/kaaneminoglu/Documents/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.tiklagelsin.com");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}