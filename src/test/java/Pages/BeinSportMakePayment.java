
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

public class BeinSportMakePayment extends BaseClass {


    public By txt_cardholder = By.id("Ecom_Payment_Card_Name");
    public By txt_cardnumber = By.id("Ecom_Payment_Card_Number");
    public By select_month = By.id("Ecom_Payment_Card_ExpDate_Month");
    public By select_year = By.id("Ecom_Payment_Card_ExpDate_Year");
    public By txt_cardverification = By.id("Ecom_Payment_Card_Verification");
    public By btn_confirmpayment = By.id("submit3");
    public By lbl_money = By.id("ncol_ref");

    public BeinSportMakePayment(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCardHolderName(String cardholdername) {
        driver.findElement(txt_cardholder).sendKeys(cardholdername);
    }

    public void enterCardNumber(String cardnumber) {
        driver.findElement(txt_cardnumber).sendKeys(cardnumber);
    }

    public void selectMonth() {
        WebElement element = driver.findElement(select_month);
        Select selmonth = new Select(element);
        selmonth.selectByValue("03");
    }

    public void selectYear() {
        WebElement element = driver.findElement(select_year);
        Select selyear = new Select(element);
        selyear.selectByValue("2023");
    }

    public void enterCardVerificationCode(String verificationcode) {
        driver.findElement(txt_cardverification).sendKeys(verificationcode);
    }

    public void clickConfirmPayment() {
        driver.findElement(btn_confirmpayment).click();
    }

}


