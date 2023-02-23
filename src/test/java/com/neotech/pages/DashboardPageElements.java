package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {

	@FindBy(id = "account-name")
	public WebElement accountName;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;

	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeeLink;
	
	@FindBy(linkText = "Employee List")
	public WebElement employeeListLink;
	
	@FindBy(xpath="//*[@id='menu_news_More']/a")
	public WebElement moreMenuItem;
	
	@FindBy(xpath="//div[@id='menu-content']/ul/li")
	public List<WebElement> menuList;

	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}

}
