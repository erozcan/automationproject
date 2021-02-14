
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class BeinSportCreateAccount extends BaseClass {


    public By txt_firstname = By.name("FirstName");
    public By txt_lastname = By.name("LastName");
    public By txt_email = By.name("EmailOrPhone");
    public By txt_password = By.id("password");
    public By select_checkbox = By.xpath("//*[@id=\"form-register\"]/div/div[2]/div[6]/div[1]/label");
    public By btn_createaccount = By.xpath("//*[@id=\"form-register\"]/div/div[2]/div[9]/input");

    public BeinSportCreateAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstname) {

        driver.findElement(txt_firstname).sendKeys(firstname);

    }

    public void enterLastName(String lastname) {

        driver.findElement(txt_lastname).sendKeys(lastname);
    }

    public void enterEmail(String email) {

        driver.findElement(txt_email).sendKeys(email);
    }

    public void enterPassword(String password) {

        driver.findElement(txt_password).sendKeys(password);
    }

    public void selectOffersCheckbox() {

        driver.findElement(select_checkbox).click();
    }

    public void clickCreateAccount() {

        driver.findElement(btn_createaccount).click();
    }


}


