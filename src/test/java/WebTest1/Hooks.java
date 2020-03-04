package WebTest1;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;

public class Hooks extends Utils {

    private String timestamp = new SimpleDateFormat("yyyy.MM.DD.Hh.MM.SS").format(new Date( ));
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
    }

    @After
    public void closeBrowser (Scenario scenario) throws IOException
    {
        if (scenario.isFailed( ))
        {
            String screenshotName = scenario.getName().replaceAll("[.,:;?!]", "") + timestamp + ".png";
            try
            {
                   //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                   //Building up the destination path for the screenshot to save
                   //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "/target/Destination/screenshots/" + screenshotName);
                   //Copy taken screenshot from source location to destination location
                copyFile(sourcePath, destinationPath);
                scenario.write("!!!!!!!....Scenario Failed....!!!!!!! Please see attached screenshot for the error/issue");
                   //attach the screenshot to our report
                //scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
            }catch (IOException e) {
            }
        }
        driver.quit();
    }

        //browserSelector.closeBrowser();
    }




