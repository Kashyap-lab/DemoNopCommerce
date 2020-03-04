package WebTest1;

import org.openqa.selenium.By;

public class ProductComparision extends Utils {
    String expected = "Compare products";
    private By _pageTitle = By.xpath("//div [@class='page-title']");
    public void verifyUserOnProductComparisonPage(){assertTextMessage("page not found",expected, _pageTitle);

    }
}
