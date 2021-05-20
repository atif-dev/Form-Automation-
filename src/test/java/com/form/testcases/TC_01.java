package com.form.testcases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.form.pageobjects.TestCase1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {
	
	@Parameters("browser")
	@Test
	public static void main() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		Dimension d = new Dimension(1477,729);
		//Dimension d = new Dimension(1477,830);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);
        Thread.sleep(2000);
        
     // This  will scroll down the page by  1000 pixel vertical	
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        
        TestCase1 tc1 = new TestCase1(driver);
        tc1.addFirstName("Atif");
        Thread.sleep(2000);
        
        tc1.addLastName("Iqbal");
        Thread.sleep(2000);
        
        tc1.selectMale();
        Thread.sleep(2000);
        
        tc1.selectFemale();
        Thread.sleep(2000);
        
        tc1.selectMale();
        Thread.sleep(2000);
        
        tc1.selectExperience();
        Thread.sleep(2000);
        
        //Get current date and input in text field
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        tc1.selectDate(formatter.format(date));
        Thread.sleep(2000);
        
        tc1.clickCheckProfession();
        Thread.sleep(2000);
        
        tc1.clickCheckProfession2();
        Thread.sleep(2000);
        
        tc1.clickCheckTools();
        Thread.sleep(2000);
        
        tc1.selectDropDwonElement();
        Thread.sleep(2000);
        
        tc1.selectMultiOne();
        Thread.sleep(2000);
        
        tc1.chooseFile();
        Thread.sleep(2000);
        
        tc1.downloadFile();
        Thread.sleep(3000);
        System.out.println("Step#11 is invalid, there is no download file pop-pop as per instruction");
        
        driver.navigate().back();
		Thread.sleep(3000);
		
		tc1.clickButton();
		
        
        
        
        
		
	}

}
