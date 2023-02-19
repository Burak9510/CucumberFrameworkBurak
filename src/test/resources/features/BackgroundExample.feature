@background
Feature: Background Example

  Background: 
    Given Precondition1
    And Precondition2

  @smoke @sprint5
  Scenario: Example1
    When Test step nr1 firstName is "Vugar" and lastName is "Alisultanov"
    And Test step nr2
    And Test step n3 age is 30
    Then Validation nr1
    And Validation nr2

  Scenario: Example2
    When Test step nr4
    And Test step nr5
    And Test step nr6
    Then Validation nr3
    And Validation nr4
#----------
#Hooks ---> @Before
#Background Steps
#Scenario Example1
#Hooks ---> @After
#---------
#Hooks 
