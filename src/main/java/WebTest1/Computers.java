package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.ArrayList;
import java.util.List;

public class Computers extends Utils {

    private By _Notebook = By.linkText("Notebooks");
    public void UserClickOnNotebook(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_Notebook);
    }
    public void SelectDropdownByVisibleText(){
        Select select = new Select(driver.findElement(By.id("products-orderby")));
        select.selectByVisibleText("Price: High to Low");

//       // public void UserSelectFromPositionPriceHighToLow() {SelectDropdownByVisibleText(_dropdown, priceHighToLow);
//
//        public void verifyUserShouldBeAbleToSeePriceHighToLow() {
//       //         List<WebElement> myList = driver.findElements(By.className("prices"));
//                //mylist contains all the web elements
//                // if you want to get all elements text into array lists
//        List<String> all_elements_text = new ArrayList<>();
//        for (int i =0; i<myList.size(); i++){
//            all_elements_text.add(myList.get(i).getText());
//            System.out.println(myList.get(i).getText());
//        }
//            }
    }

}



