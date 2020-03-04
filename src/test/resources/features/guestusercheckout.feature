Feature: verifyGuestUserShouldBeAbleToCheckOutSuccessfully
@guestusercheckout
  Scenario: verify Guest User Should Be Able To Checkout Successfully
  Given click on jewelry on homepage
  And click on add to cart on any product
  And Enter the guest details
  And Enter Shipping Address
  Then Enter choose payment detail & checkout successfully
