Feature: Nop commerce Login Functionality
  Description: Testing on Nop commerce Login Functionality with provided credentials

  Scenario: Successful Login with valid credentials
    Given User launch chrome browser
    When  User opens url "https://admin-demo.nopcommerce.com/login"
    And   User enters emailid as "admin@yourstore.com" and password as "admin"
    And  Click Login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then Page Title should be "Your store. Login"
    And Close browser
