package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboardSteps extends CommonMethods {

	@Then("I want to validate the items on the menu")
	public void i_want_to_validate_the_items_on_the_menu(DataTable dataTable) {
		System.out.println(dataTable);
		
		List<String> expectedList = dataTable.asList();
		List<String> actualList = new ArrayList<>();
		
		//click on the more menu to collapse it
		click(dashboard.moreMenuItem);
		
		wait(2);
	
		for(WebElement el : dashboard.menuList) {
			
			actualList.add(el.getText());
		}
	   System.out.println("Actual List: " + actualList);
	   
	   Assert.assertEquals(expectedList, actualList);
	}
}
