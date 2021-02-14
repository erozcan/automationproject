
package StepDefinitions;

import Pages.BeinSportValidatePackagePrice;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BaseClass;

public class BeinSportValidatePackagePriceStep extends BaseClass {

    BeinSportValidatePackagePrice bsubscribe;
    BaseClass bclass;


    @Given("digiturk australia page is open")
    public void digiturk_australia_page_is_open() throws InterruptedException {

        System.out.println("anasayfa açıldı");

    }

    @When("user click subscribe button")
    public void user_click_subscribe_button() {
        bsubscribe = new BeinSportValidatePackagePrice(driver);
        bsubscribe.clickSubscribeButton();
    }

    @And("package price should be validate")
    public void package_price_should_be_validate() {
        String expectedPackagePrice = "AU$19.99";
        String actualPackagePrice = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/div[1]/span[2]")).getText();
        Assert.assertEquals("Verify Shipping Price", expectedPackagePrice, actualPackagePrice);
    }

    @And("user click register Monthly Plan with Two Week Free Trial")
    public void user_click_register_monthly_plan_with_two_week_free_trial() throws InterruptedException {
        bsubscribe.clickSelectPackageButton();
        Thread.sleep(2000);
    }

    @Then("user navigated to the create account page")
    public void user_navigated_to_the_create_account_page() {
        System.out.println(driver.getPageSource());
        driver.getPageSource().contains("CREATE ACCOUNT");
    }

}

