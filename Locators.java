package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public void getDifferentLocators() {
    System.setProperty("webDriver.chrome.driver","c:/Users/user/Downloads/chromedrivers.exe");
	
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://login.yahoo.com/");
	
    /*Locators :Selenium supports 8 different types of locators namely id, name, className, tagName, linkText, 
	  partialLinkText, CSS selector and xpath.
	  Using id is one of the most reliable and fast methods of element recognition.
	  Usually, the id is always unique on a given web page.*/
	  
	  //1.id:
	  WebElement userName = driver.findElement(By.id("login-username"));
	  userName.sendKeys("testpriya@yahoo.com");
	  
	  WebElement nextBtn  = driver.findElement(By.id("login-signin"));
	  nextBtn.click();
	  
	   //2.Name :
	  driver.findElement(By.name("username")).sendKeys("test@yahoo.com");
	  driver.findElement(By.name("signin")).click();
	  
	  //3.xpath :
	  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test@yahoo.com");
	  driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	 
	  //4.cssSelector :
	  driver.findElement(By.cssSelector("#login-username")).sendKeys("test@yahoo.com");
	  driver.findElement(By.cssSelector("#login-signin")).click();
	  
	  //5.linkText :only for links
	  driver.findElement(By.linkText("Stay signing in")).click();
	  driver.findElement(By.linkText("Sign Up")).click();
	  
	  //6.partiallinkText :
	  driver.findElement(By.partialLinkText("Difficulty")).click();
	  
	  //7.class Name:
	   driver.findElement(By.className("phone-no")).sendKeys("test@yahoo.com");
	}
	
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  