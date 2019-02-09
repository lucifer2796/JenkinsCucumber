package org.BasicCucumber.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Unit test for simple App.
 */
public class StepDefinition 
{
	static WebDriver driver=null;
@Given("^user is present on Google URL$")
public void user_is_present_on_Google_URL() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Basic Setup\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://google.com");
     
	
}

@Given("^enter a search keyword$")
public void enter_a_search_keyword() throws Throwable {
  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Testing");
     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ESCAPE);
     Thread.sleep(5000);
}

@Then("^click search$")
public void click_search() throws Throwable {
   driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
   Thread.sleep(2000);
     
}

@Then("^Search results are generated$")
public void search_results_are_generated() throws Throwable {
  System.out.println(driver.getCurrentUrl() + driver.getTitle());
     
}


}