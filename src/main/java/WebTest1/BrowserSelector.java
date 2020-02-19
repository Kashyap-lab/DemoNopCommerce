package WebTest1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector  extends Utils{
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage(). timeouts(). implicitlyWait (20, TimeUnit.MILLISECONDS);
        driver.manage(). window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }
    //public void closeBrowser(){driver.close();
   // }
}
