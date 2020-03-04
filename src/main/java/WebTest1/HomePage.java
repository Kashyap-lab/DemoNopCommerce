package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils {

    private By _registerLink = By.xpath("//a[contains(., 'Register')]");
    private By _DigitalDownloads = By.linkText("Digital downloads");
    private By _computer = By.linkText("Computers");
    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");
    private By _viewNewsArchive = By.xpath("//a[contains(text(),'Archive')]");
    private By _currency = By.id("customerCurrency");
    private String value = "Euro";

    // verify that user click on register button
    public void clickOnRegisterButton(){clickOnElement(_registerLink);}
    public void clickOnDigitalDownloads() {clickOnElement(_DigitalDownloads);}
    //verify that user click on computer category
    public void clickOnComputerCategory(){clickOnElement(_computer);}
    //verify that user click on jewellery category
    //List<WebEl
    public void clickOnJewelryCategory(){clickOnElement(_jewelryLink);
    //public void clickOnViewNewsArchive(){clickOnElement(_viewNewsArchive);}






    }
}