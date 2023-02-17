package com.neotech.steps;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeSteps extends CommonMethods{



	@Given("user navigates to employee list page")
	public void user_navigates_to_employee_list_page() {
	    click(dashboard.PIM);
	    click(dashboard.employeeListLink);
	    wait(2);
	    
	}
	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	    sendText(employeeList.searchBox, "0036");
	wait(3);	
	}

	@When("user enters valid employee first and last name")
	public void user_enters_valid_employee_first_and_last_name() {
	    sendText(employeeList.searchBox,"Brody Alan");
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
	    jsClick(employeeList.searchIcon);
	    wait(5);
	}

	
	@Then("employee information is displayed")
	public void employee_information_is_displayed() {
	    System.out.println("Yes it is displayed :)");
	    wait(5);
	    
	    // its done in the Hooks
//	    tearDown();
}
}