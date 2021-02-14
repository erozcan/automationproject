
package utils;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static void setDriver() {
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://connect-au.beinsports.com/en");
        driver.manage().window().maximize();
    }

    public static void closeDriver()  {

        driver.quit();
    }


}


