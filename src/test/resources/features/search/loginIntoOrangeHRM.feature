Feature: Login into HRM

  Scenario: login as admin with valid credentials
    Given User is on login page
    When User enter "Admin" as username
    When User enter "Admin123" as password
    Then User should be able to login
