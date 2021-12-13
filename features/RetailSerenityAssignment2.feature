@RetailAssignment
Feature: Retail User Registration and Login Validation

  @RegistrationForRetail
  Scenario: User Registers in Retail website
    Given I am on Retail Website
    And I select User Registration
    When I Enter Mandatory Data
    |First Name |manzoor       |
    |Last Name  |mehadi    |
    |E-Mail     |manzor@gmail.com |
    |Telephone  |9876543210|
    |Address 1  |yeshwanthapur|
    |Address 2  |bangalore|
    |City       |bangalore|
    |Post Code  |560022|
    |Country    |India|
    |Region / State|Karnataka|
    |Password   |manzoor1|
    |Password Confirm|manzoor1|          
    Then I validate the User Sucessfull registration Message
      
 

  @Login
   Scenario: User Logins in Retail website
    Given I am on Retail Website
    When I enter login credentials
     |E-Mail     |manzoor@gmail.com |
     |Password   |manzoor1|
   Then I validate the User Sucessfull Login
