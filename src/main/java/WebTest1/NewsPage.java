package WebTest1;

import org.junit.Assert;
import org.openqa.selenium.By;

public class NewsPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _news = By.xpath("//a[contains(@href,'about')and(@class='read-more')]");
    private By _title = By.xpath("//input[@class='enter-comment-title']");
    private String title = "about nopcommerce website";
    private By _comment = By.xpath("//textarea[@class='enter-comment-text']");
    private String comment = "Very Helpful, Thanks ;) ";
    private By _newcomment = By.xpath("//input[@name = 'add-comment']");
    private By _successmessage = By.xpath("//div[contains(text(),'successfully ')]");

    public void userClickOnDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_news);
        EnterText(_title, title);
        EnterText(_comment, comment);
        clickOnElement(_newcomment);

    }

    private By _successMessage = By.xpath("//div[@class=\"result\"]");
    String expected = "News comments is successfully added.";





    public void verifysuccessmessageofcomment() {

        assertTextMessage("",expected,_successMessage);
    }
}
