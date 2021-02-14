
package StepDefinitions;

import Pages.BeinSportSelectPaymentMethod;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseClass;

public class BeinSportSelectPaymentMethodStep extends BaseClass {

    BeinSportSelectPaymentMethod pmethod;

    @Before
    public void setUpDriver(){

        pmethod.setDriver();

    }

    @When("user select payment method")
    public void user_select_payment_method() throws InterruptedException {
        pmethod = new BeinSportSelectPaymentMethod(driver);
        pmethod.selectPaymentMethod();
        Thread.sleep(2000);
    }

    @And("click terms and conditions checkbox")
    public void click_terms_and_conditions_checkbox() throws InterruptedException {
        pmethod.selectTermConditionCheckbox();
        Thread.sleep(1000);
    }

    @And("user click pay now")
    public void user_click_pay_now() throws InterruptedException {
        pmethod.clickPaynowButton();
        Thread.sleep(1000);

    }

    @Then("user navigated to credit card page")
    public void user_navigated_to_credit_card_page() {

        driver.getPageSource().contains("RecurringPayment");
    }


}
