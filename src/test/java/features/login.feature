Feature: login Functionality
  @login
  Scenario: login with valid credential
    Given   User open the browser
    When    User fill the email as "k.bedoui@elsevier.com" and password as "Test123" and click on login button
    Then    User should navigate at the home page


    Scenario Outline: login with wrong credential
      Given   User open the browser
      When    User fill the email as "<email>" and password as "<password>" and click on login button
      Then    User shouldnt navigate at the home page
      Examples:
      |email|password|
      |test123@gmail.com|123456|

