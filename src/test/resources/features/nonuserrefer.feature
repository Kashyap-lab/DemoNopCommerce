Feature: Non Registered user can not refer product to friend
  @nonuserrefer
  Scenario: Non Registered user can not refer product to friend
  Given User is on homePage
  When Click on notebooks from sub-categories
  And User refer to a friend
  Then Non register user can not refer a friend




