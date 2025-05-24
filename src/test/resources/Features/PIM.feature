Feature: Add Employee with Login Details

  
  Background:
    Given User navigated to the url
    And user signed into the application
  
 @employee
  Scenario: Add a new employe in PIM module
    When user navigates to the PIM page
    And I click on the Add button
    And I enter employee first name 
    And I enter employee last name
    And I see employee ID number
    And I click on the Save button
    Then the employee should be added successfully
