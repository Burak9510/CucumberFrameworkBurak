#Author: Burak Ingin
Feature: Add Employee Feature
  I want to test the Add Employee Functionality

  @AddEmployee
  Scenario: Add Employee with first and last name
    Given user is logged in with valid credentials
    And user navigates to Add Employee page
    When user enters employee first and last name
    And user selects a location
    And user clicks on save button
    Then validate that employee is added successfully
