Feature: tours

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the guides button in tours
    Then I should be redirected to index.html#guides

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the stops button in tours
    Then I should be redirected to index.html#pois

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the login button in tours
    Then I should be redirected to login.html

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the register button in tours
    Then I should be redirected to register.html

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the home button in tours
    Then I should be redirected to index.html