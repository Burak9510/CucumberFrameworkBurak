package com.neotech.steps;

import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class AddEmployeeSteps extends CommonMethods {

	@Given("user navigates to Add Employee page")
	public void user_navigates_to_add_employee_page() {
		click(dashboard.PIM);
		click(dashboard.addEmployeeLink);
	}

	// Hard-coded step
	@When("user enters employee first and last name")
	public void user_enters_employee_first_and_last_name() {
		sendText(addEmployee.firstName, "Lionel");
		sendText(addEmployee.lastName, "Messi");
	}

	// Parametrized step
	@When("user enters employee first name {string} and last name {string}")
	public void user_enters_employee_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmployee.firstName, firstName);
		sendText(addEmployee.firstName, lastName);
	}

	@When("user selects a location")
	public void user_selects_a_location() {
		selectDropdown(addEmployee.location, "New York Sales Office");

	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		wait(1);
		click(addEmployee.saveButton);
	}

	// Hard-coded step
	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
		waitForVisibility(personalDetails.personalDetailsForm);

		String expected = "Lionel Messi";
		String actual = personalDetails.employeeName.getText();

		Assert.assertEquals("The employee name DOES NOT match!", expected, actual);
	}

	// Parametrized step
	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String expectedName) {
		waitForVisibility(personalDetails.personalDetailsForm);
		String actualName = personalDetails.employeeName.getText();
		Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		wait(1);
		addEmployee.employeeId.clear();
		wait(1);
	}

	@When("user clicks on Create Login Details")
	public void user_clicks_on_create_login_details() {
		jsClick(addEmployee.checkboxLoginDetails);
	}

	@When("user provides credentials")
	public void user_provides_credentials() {
		sendText(addEmployee.username, "RonaldoBoss");
		sendText(addEmployee.password, "Siuuu@123");
		sendText(addEmployee.confirmPassword, "Siuuu@123");
	}

	@When("user enters employee {string}, {string} and {string}")
	public void user_enters_employee_and(String first, String middle, String last) {
	    sendText(addEmployee.firstName, first);
	    sendText(addEmployee.middleName,middle);
	    sendText(addEmployee.lastName,last);
	}
	@When("user selects a location {string}")
	public void user_selects_a_location(String location) {
		selectDropdown(addEmployee.location, location);
	}
	@Then("validate that {string} and {string} is added successfully")
	public void validate_that_and_is_added_successfully(String firstName, String lastName) {
		waitForVisibility(personalDetails.personalDetailsForm);
		String expectedName = firstName + " " + lastName;
		String actualName = personalDetails.employeeName.getText();
		
		Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);
	}

	
	@When("user enters employee details and clicks on save and validates it is added")
	public void user_enters_employee_details(DataTable table) {
		// System.out.println(table);

		// asLists() method returns a List for every row (including the header)
		// System.out.println(table.asLists());

		// asMaps() method returns a List of Maps for every data row (NOT including the
		// header)
		System.out.println(table.asMaps());

		List<Map<String, String>> employeeList = table.asMaps();

		for (Map<String, String> employee : employeeList) {
			System.out.println(employee);

			String fName = employee.get("FirstName");
			String mName = employee.get("MiddleName");
			String lName = employee.get("LastName");

			sendText(addEmployee.firstName, fName);
			sendText(addEmployee.middleName, mName);
			sendText(addEmployee.lastName, lName);

			selectDropdown(addEmployee.location, "France Regional HQ");

			wait(1);

			click(addEmployee.saveButton);

			waitForVisibility(personalDetails.personalDetailsForm);

			// Validation
			String expectedName = fName + " " + lName;
			String actualName = personalDetails.employeeName.getText();

			Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);

			// Before next iteration
			// We need to go to Add Employee page again
			wait(1);
			click(dashboard.addEmployeeLink);
	}



}
}