Feature: Banner Functionality
  @Banner-01
  Scenario: Checking Banner for Valid Formation
    Given User open the browser
    When  User fill the email as "k.bedoui@elsevier.com" and password as "Test123" and click on login button
    Then  Banner should be displayed

  @Banner-02
  Scenario: Checking text banner for Valid Formation
    Given User open the browser
    When  User fill the email as "k.bedoui@elsevier.com" and password as "Test123" and click on login button
    Then  Text Banner should be the same

  @Banner-03
  Scenario: Checking redirection to new url from  banner with Valid Formation
    Given User open the browser
    When  User fill the email as "k.bedoui@elsevier.com" and password as "Test123" and click on login button
    And   User click on the redirection button on the banner
    Then  redirection should be displayed in new tab