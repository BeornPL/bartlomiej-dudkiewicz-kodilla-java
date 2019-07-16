package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestinggApp {
    public static final String XPATH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select";
    public static final String FIRST = "[1]";
    public static final String SECOND = "[2]";
    public static final String THIRD = "[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT+FIRST));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("19");

        selectCombo = driver.findElement(By.xpath(XPATH_SELECT+SECOND));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(6);

        selectCombo = driver.findElement(By.xpath(XPATH_SELECT+THIRD));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("1955");
    }
}
