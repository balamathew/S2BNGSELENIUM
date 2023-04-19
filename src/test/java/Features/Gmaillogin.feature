Feature: gmail account

  @gmail
  Scenario:[gmail-001] Login to gmail with valid details
    Given User opens the chrome browser with URL as "https://www.facebook.com/login/" and enter below credentials
      |username|balarocks910@gmail.com|
      |password|9003052674333       |
    Then clicks on the login button
