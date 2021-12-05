@MakeMyTripAssignment
Feature: Title of your feature
  I want to use this template for my feature file

  @OneWaySearch
  Scenario: Search OneWay Trip on MakeMyTrip 
    Given I am on Make My Trip
    When I search One Way Search
    |From|Delhi |
    |To  |Hyderabad    |
    Then I validate the search results for One Way Trip
     |From|Delhi|
     |To  |Hyderabad   |
 

  @RoundTripSearch
   Scenario: Search RoundTrip Trip on MakeMyTrip 
    Given I am on Make My Trip
    When I search RoundTrip Search
   |From|Delhi |
    |To  |Hyderabad    |
    Then I validate the search results for RoundTrip
    |From|Delhi |
    |To  |Hyderabad    |
