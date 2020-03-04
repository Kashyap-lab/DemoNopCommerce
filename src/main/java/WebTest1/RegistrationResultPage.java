package WebTest1;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {

    private By _registerSuccessMessage = By.className("result");
    String expected = "Yours registration completed";

    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL("registerresult");
        assertTextMessage("",expected,_registerSuccessMessage);
    }
}
