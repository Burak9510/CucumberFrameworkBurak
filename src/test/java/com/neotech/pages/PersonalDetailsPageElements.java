package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {

	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;

	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	@FindBy(id= "pim.navbar.employeeName")
	public WebElement employeeName;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
