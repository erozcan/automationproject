
package StepDefinitions;

import Pages.BeinSportCreateAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseClass;


public class BeinSportCreateAccountStep extends BaseClass {

    BeinSportCreateAccount baccount;



    @Given("user is on account page")
    public void user_is_on_account_page() {
        System.out.println("create account page is open");

    }

    @When("^user enters (.*) and (.*) and (.*) and (.*)$")
    public void user_enters_firstname_and_lastname_and_email_and_password(String firstname, String lastname, String email, String password) {
        baccount = new BeinSportCreateAccount(driver);

        baccount.enterFirstName(firstname);
        baccount.enterLastName(lastname);
        baccount.enterEmail(email);
        baccount.enterPassword(password);

    }

    @And("user click offers and content updates checkbox")
    public void user_click_offers_and_content_updates_checkbox() {
        baccount.selectOffersCheckbox();
    }

    @And("user click create account button")
    public void user_click_create_account_button() throws InterruptedException {

        baccount.clickCreateAccount();
        Thread.sleep(6000);
    }

    @Then("user is navigated to the payment page")
    public void user_is_navigated_to_the_payment_page() {

        driver.getPageSource().contains("PAYMENT METHOD");
    }
}


