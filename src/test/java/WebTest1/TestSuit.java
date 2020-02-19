package WebTest1;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    DigitalDownloads digitalDownloads = new DigitalDownloads();
    ProductComparision productComparision = new ProductComparision();
    Computers computers = new Computers();
    Categories categories = new Categories();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();


    @Test
    public void userShouldAbleToRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill up registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        //verify registrations success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @Test
    public void userShouldAbleToCompareTwoProducts(){
        homePage.clickOnDigitalDownloads();
       // digitalDownloads.verifyUserIsOnDigitalDownloadsPage();
        digitalDownloads.chooseProductsToCompare();
        productComparision.verifyUserOnProductComparisonPage();
    }
    @Test
    public void nonRegisterUserShouldNotBeAbleToReferAProductToAFriend(){
        homePage.clickOnComputerCategory();
        productDetailsPage.VerifyUserIsOnComputerCatagoryPage();
        productDetailsPage.userClickOnNoteBook();
        productDetailsPage.userClickOnAppleMac();
        productDetailsPage.UserReferToFriend();
    }

    @Test
    public void RegisteredUserShouldBeAbleToReferAFriendSuccessfully(){
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        homePage.clickOnComputerCategory();
        categories.verifyUserOnComputerCategoriesPage();
        categories.userClickOnNoteBook();
        categories.userClickOnAppleMac();
        categories.userReferToFriend();

    }

    @Test
    public void UserShouldBeAbleToSortProductHighToLowByPrice(){
        homePage.clickOnComputerCategory();
        computers.UserClickOnNotebook();
        computers.SelectDropdownByVisibleText();
    }
}

