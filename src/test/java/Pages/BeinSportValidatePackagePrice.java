
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class BeinSportValidatePackagePrice extends BaseClass {


    public By btn_subscribe = By.name("Subscribe");
    public By btn_selectpackage = By.xpath("/html/body/div[4]/div[1]/div/div[1]/div[2]/div[2]/a");

    public BeinSportValidatePackagePrice(WebDriver driver) {
        this.driver = driver;

    }

    public void clickSubscribeButton() {

        driver.findElement(btn_subscribe).click();
    }

    public void clickSelectPackageButton() {

        driver.findElement(btn_selectpackage).click();

    }


}


