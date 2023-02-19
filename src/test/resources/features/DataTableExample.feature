Feature: Scenarios with DataTable

@dataTable
  Scenario: Add Employee with DataTable
    When I login to the HRMS
    And I want to add Employees
      | FirstName | MiddleName | LastName |
      | Dardan    |            | Meshi    |
      | Serkan    |            | Kopuz    |
      | Karen     | Sayuri     | Murakami |
    Then I validate employee is added
