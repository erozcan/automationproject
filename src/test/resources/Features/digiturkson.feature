Feature: feature digiturk

  @smoke
  Scenario Outline: validate package price

    Given digiturk australia page is open
    When user click subscribe button
    And package price should be validate
    And  user click register Monthly Plan with Two Week Free Trial
    When user enters <firstname> and <lastname> and <email> and <password>
    And user click offers and content updates checkbox
    And user click create account button
    When user select payment method
    And click terms and conditions checkbox
    And  user click pay now
    And  validate total charge is one
    When user enters the cardholdername and cardnumber and verificationcode
    And user select expiry date
    And user click confirm payment button
    Then user is should see not valid card number message

    Examples:
      | firstname | lastname  | email            | password |
      | Digiedrk1  | Digdurk2| digisar2kpazar@gmail.com | Digfhu2rk12 |










