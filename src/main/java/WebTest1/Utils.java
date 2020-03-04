package WebTest1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    public void clickOnElement(By by) { driver.findElement(by).click();   }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public static void selectTextFromDropDown(By by, String text) {
        Select selectCountry = new Select(driver.findElement(by));
        selectCountry.selectByValue(text);
    }
    public static void SelectFromCurrencyDropdown(By by, String text) {
        Select selectCurrency = new Select(driver.findElement(by));
        selectCurrency.selectByValue(text);
    }
    public void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void EnterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
        waitForClickable(by, 40);
    }
    public static String createTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void assertTextMessage(String message, String expected, By by)
    {
        String actual = getTextFromElement(by);
        Assert.assertEquals(message, expected,actual);
    }
//public static void

    public static void assertURL(String text) {
      //  Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
    public static void clickOnDigitalDownloads(By by) {
        driver.findElement(by).click();
    }

    //select from dropdown by visible text method
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public void SelectFromDropDownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }


}

