#Author: Burak Ingin
Feature: Add Employee Feature
  I want to test the Add Employee Functionality

  Background: 
    Given user is logged in with valid credentials
    And user navigates to Add Employee page

  @AddEmployee
  Scenario: Add Employee with first and last name
    When user enters employee first and last name
    And user selects a location
    And user clicks on save button
    Then validate that employee is added successfully

  @task
  Scenario: Add Employee with parametrized first and last name
    When user enters employee first name "Cristiano" and last name "Ronaldo"
    And user selects a location
    And user clicks on save button
    Then validate that employee "Cristiano Ronaldo" is added successfully

  @third
  Scenario: Add Employee without employee id
    When user enters employee first and last name
    And user deletes employee id
    And user selects a location
    And user clicks on save button
    Then validate that employee is added successfully

  @fourth @sprint15
  Scenario: Add Employee and create login Credentials
    When user enters employee first name "Betim" and last name "Lusha"
    And user selects a location
    And user clicks on Create Login Details
    And user provides credentials
    And user clicks on save button
    Then validate that employee "Betim Lusha" is added successfully
