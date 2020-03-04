package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    DigitalDownloads digitalDownloads = new DigitalDownloads();
    ProductComparision productComparision = new ProductComparision();
    Computers computers = new Computers();
    Categories categories = new Categories();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    SoftAssert softAssert = new SoftAssert();
    JewelryPage jeweleryPage = new JewelryPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    NewsPage newsPage = new NewsPage();
    AddToCartButton addToCartButton = new AddToCartButton();
    CheckOutResult checkOutResult = new CheckOutResult();







    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill up registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        //verify registrations success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @Test
    public void userShouldAbleToCompareTwoProducts() {
        homePage.clickOnDigitalDownloads();
        // digitalDownloads.verifyUserIsOnDigitalDownloadsPage();
        digitalDownloads.chooseProductsToCompare();
        productComparision.verifyUserOnProductComparisonPage();
    }

    @Test
    public void nonRegisterUserShouldNotBeAbleToReferAProductToAFriend() {
        homePage.clickOnComputerCategory();
        productDetailsPage.VerifyUserIsOnComputerCatagoryPage();
        productDetailsPage.userClickOnNoteBook();
        productDetailsPage.userClickOnAppleMac();
        productDetailsPage.UserReferToFriend();
    }

    @Test
    public void RegisteredUserShouldBeAbleToReferAFriendSuccessfully() {
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
    public void UserShouldBeAbleToSortProductHighToLowByPrice() {
        homePage.clickOnComputerCategory();
        computers.UserClickOnNotebook();
        computers.SelectDropdownByVisibleText();
    }

    @Test
    public void verifyGetThePriceForEachProduct() {
        List<WebElement> price = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement we : price) {
            System.out.println(we.getText());
            System.out.println("------------");
            // will check just one line and comeout.
            softAssert.assertTrue(we.getText().contains("$"), "£ not found in" + we.getText());
        }
        softAssert.assertAll();
        System.out.println("My name is Kash");
    }

    @Test
    public void verifyGuestUserShouldBeAbleToCheckOutSuccessfully() {
        homePage.clickOnJewelryCategory();
        jeweleryPage.verifyUserIsOnJewelryPage();
        jeweleryPage.addToCartProduct();
        guestCheckout.checkoutAsGuest();
        shippingAddress.userShippingAddress();
        paymentMethod.userChoosePaymentMethod();

    }
    @Test
    public void guestUserShouldBeAbleToAddNewComment(){
        newsPage.userClickOnDetails();
        newsPage.verifysuccessmessageofcomment();
    }

    @Test
    public void userShouldBeAbleToVerifyCurrency(){
        changeCurrency.userselectcurrency();
        changeCurrency.verifyCurrency();
    }
    @Test
    public void verifyAddToCartButtonIsPresentOnAllFeaturedProduct(){
        addToCartButton.verifyAddToCartButton();


    }

}