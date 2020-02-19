package WebTest1;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _registerLink = By.xpath("//a[contains(., 'Register')]");
    private By _DigitalDownloads = By.linkText("Digital downloads");
    public void clickOnRegisterButton(){clickOnElement(_registerLink);}
    public void clickOnDigitalDownloads() {clickOnElement(_DigitalDownloads);}
    private By _computer = By.linkText("Computers");
    public void clickOnComputerCategory(){clickOnElement(_computer);}
}