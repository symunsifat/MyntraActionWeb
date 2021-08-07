Feature: This feature file is for Myntra Login feature
@Sanity @Regrassion
  Scenario: Verify Login Functionality
    Given Customer landing on the Myntra homepage
    When Click on the Profile icon
    And Click on the Login/Signup 
    And Put the mobile number 9903241168
    Then User should be able to land on the Verify OTP page


