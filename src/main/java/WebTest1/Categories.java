package WebTest1;

import org.junit.Assert;
import org.openqa.selenium.By;
   //UserShouldBeAbleToSortProductHighToLowByPrice
public class Categories extends Utils {
    private By _noteBooks = By.linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath("//input[@type=\"button\"and@value=\"Email a friend\"]");
    private By _friendEmail = By.xpath("//input[@class=\"friend-email\"]");
    private By _writeInTextBox = By.xpath("//*[@id=\"PersonalMessage\"]");
    private By _sendEmail = By.xpath("//input[@name=\"send-email\"]");
    private By _successfulReferMessage = By.xpath("//*[@class=\"result\"]");
    String expected = "I am suggesting you, to buy this Mac";

    // Verify user on computer categories page
    public void verifyUserOnComputerCategoriesPage() {
        assertURL("computers");
    }
    public void userClickOnNoteBook()
    {
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_noteBooks);
    }

    //select item Apple MacBook Pro
    public void userClickOnAppleMac()
    {clickOnElement(_appleMac);}

    // Refer to friend
    public void userReferToFriend() {
        //click email to refer
        clickOnElement(_email);
    //Enter details to refer a friend
        EnterText(_friendEmail, "test@gmail.com");

        //enter text in text box
        EnterText(_writeInTextBox, "message");
        // click send email button
        clickOnElement(_sendEmail);

        assertTextMessage( "Your message has been sent.",expected,_successfulReferMessage);
        Assert.assertNotEquals(expected,_successfulReferMessage);
    }
}
