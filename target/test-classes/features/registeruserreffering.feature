Feature: Registered user refer product to friend Successfully
  @registeruserreffering
  Scenario: Registered user refer product to friend
    Given  User is on homePage
    When Click on registration button
    And User enter email address & password
    And   click on computers
    And   click on item
    And Click on email a friend button
    And Enter friend's email address & password
    Then User is able to refer successfully