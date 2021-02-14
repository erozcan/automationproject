
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

public class BeinSportSelectPaymentMethod extends BaseClass {

    public By checkbox_termcondition = By.xpath("//*[@id=\"form-basket\"]/div[1]/div[4]/div[1]/label");
    public By btn_paynow = By.name("pay-now");

    public BeinSportSelectPaymentMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPaymentMethod() throws InterruptedException {

        Select cmbx = new Select(driver.findElement(By.id("drpPaymentMethod")));
        cmbx.selectByValue("9203");
        Thread.sleep(2000);

    }

    public void selectTermConditionCheckbox() {
        driver.findElement(checkbox_termcondition).click();
    }

    public void clickPaynowButton() throws InterruptedException {

        driver.findElement(btn_paynow).click();
        Thread.sleep(4000);
    }
}


