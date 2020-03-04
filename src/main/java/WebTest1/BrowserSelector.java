package WebTest1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector  extends Utils{
    public void setUpBrowser() {
        LoadProp loadProp = new LoadProp();
        String browser =  "chrome";//loadProp.getProperty
        {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDriver/geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "src/test/resources/BrowserDriver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://demo.nopcommerce.com/");
        }
//        public void closeBrowser() {
//            driver.close();
//        }
    }
}
