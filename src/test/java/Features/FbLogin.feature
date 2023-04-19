Feature: Login to fb

  Background: check the intenet connection before stating each tests
    Given Check the internet connection before each scenario
  Scenario: Login to fb with valid credentials
    Given Login to fb with url
    Then enter emailid as "balamathew910" and password as "123"
    Then click on login button


