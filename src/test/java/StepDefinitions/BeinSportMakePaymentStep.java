
package StepDefinitions;

import Pages.BeinSportMakePayment;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseClass;

public class BeinSportMakePaymentStep extends BaseClass {

    BeinSportMakePayment mPayment;


    @Given("user is on credit card page page")
    public void user_is_on_credit_card_page_page() throws InterruptedException {
        System.out.println("credit card page is opened");
        Thread.sleep(5000);
    }


    @When("^user enters the (.*) and (.*) and (.*)$")
    public void userEntersTheCardholdernameAndCardnumberAndVerificationcode(String cardholdername,String cardnumber,String verificationcode) {
        mPayment = new BeinSportMakePayment(driver);
        mPayment.enterCardHolderName("digiturk");
        mPayment.enterCardNumber("4324232432432");
        mPayment.enterCardVerificationCode("323");
    }


    @And("user select expiry date")
    public void user_select_expiry_date() {

        mPayment.selectMonth();
        mPayment.selectYear();
    }

    @And("user click confirm payment button")
    public void user_click_confirm_payment_button() {

        mPayment.clickConfirmPayment();
    }

    @And("validate total charge is one")
    public void validate_total_charge_is_one() {
        driver.getPageSource().contains("1.00 AUD");
    }

    @Then("user is should see not valid card number message")
    public void user_is_should_see_not_valid_card_number_message() throws InterruptedException{
        String popUpText = driver.switchTo().alert().getText();
        System.out.println("error message is: " + popUpText);
        Thread.sleep(2000);
        closeDriver();
    }


}


