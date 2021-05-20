package com.form.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
	
	WebDriver ldriver;
	
	public TestCase1(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"post-body-3077692503353518311\"]/div/div/div[3]/input")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"post-body-3077692503353518311\"]/div/div/div[6]/input")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(how = How.ID, using = "sex-0")
	@CacheLookup
	WebElement radioMale;
	
	@FindBy(how = How.ID, using = "sex-1")
	@CacheLookup
	WebElement radioFemale;
	
	@FindBy(how = How.ID, using = "exp-3")
	@CacheLookup
	WebElement radioExp;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"datepicker\"]")
	@CacheLookup
	WebElement txtDate;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"profession-0\"]")
	@CacheLookup
	WebElement chkProfession;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"profession-1\"]")
	@CacheLookup
	WebElement chkProfession2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tool-2\"]")
	@CacheLookup
	WebElement chktools;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"continents\"]")
	@CacheLookup
	WebElement dropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"selenium_commands\"]")
	@CacheLookup
	WebElement multiSelect;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"photo\"]")
	@CacheLookup
	WebElement chooseFile;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"post-body-3077692503353518311\"]/div/div/div[29]/div[2]/div/a")
	@CacheLookup
	WebElement downloadFile;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void addFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	
	public void addLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	
	public void selectMale(){
		radioMale.click();
	}
	
	public void selectFemale(){
		radioFemale.click();
	}
	
	public void selectExperience(){
		radioExp.click();
	}
	
	public void selectDate(String date){
		txtDate.sendKeys(date);
	}
	
	public void clickCheckProfession() {
		chkProfession.click();
	}
	
	public void clickCheckProfession2() {
		chkProfession2.click();
	}
	
	public void clickCheckTools() {
		chktools.click();
	}
	
	public void selectDropDwonElement() {
		Select dropdown = new Select(dropDown);
		dropdown.selectByIndex(3);
		
	}
	
	public void selectMultiOne() {
		Select multi = new Select(multiSelect);
		multi.selectByIndex(1);
		multi.selectByIndex(2);
		multi.selectByIndex(3);
	}
	
	public void chooseFile() {
		chooseFile.sendKeys("C:\\Users\\Atif_\\Desktop\\Important\\flower-color.jpg");
	}
	
	public void downloadFile() {
		downloadFile.click();
	}
	
	public void clickButton() {
		btnSubmit.click();
	}
	
	
	

}
