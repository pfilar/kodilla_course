package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String FIREFOX = "CHROME_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";


    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver","d:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","d:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        }
        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        }
        return null;
    }
}
