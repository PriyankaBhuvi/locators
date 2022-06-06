package com.FacebookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

      public class SignUpPage extends BaseTest {
    
      
	
	
	private static final String winHandle = null;
	public void setFirstNameOnFacebookPage() {
    	  
       getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys(getFisrtName());
    	  
     }
      
    	public void setLastNameOnFacebookPage() {
    		
    	getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys(getLastName());
    	
    	
    }
        public void setRegisterMailId() {
    	   
	   getDriver().findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(getMobileNumber(9));
	   
     }
      public void setRandomPasswordFace() {
    	  
	    getDriver().findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(getPassword());
      }  
      
      
      public void setBirthDateOnFacebookPage() {
    	  
	   getDriver().findElement(By.xpath("//select[@name='birthday_day']")).sendKeys(getRandomDate());
	   
      }
      public void setBirthMonthOnFacebookPage() {
    	  getDriver().findElement(By.xpath("//select[@name='birthday_month']")).sendKeys(getRandomMonth());
      }
      public void setBirthYearOnFacebookPage() {
   	   getDriver().findElement(By.xpath("//select[@name='birthday_year']")).sendKeys(getRandomYear());

      }
      public void setGender() {
    	  if(getRandomYear().equalsIgnoreCase("Female"))
    	  getDriver().findElement(By.xpath("//input[@value = '1']")).click();
    	  else if (getRandomYear().equalsIgnoreCase("Male"))
          getDriver().findElement(By.xpath("//input[@value ='2']")).click();
    	  else
    		  getDriver().findElement(By.xpath("//input[@value = '-1']" )).click();     
      
      
	}

	public void clickOnTermsLink() {
    	getDriver().findElement(By.xpath("//a[@id='terms-link']")).click();
      }
	
	public void mouseOverLearnMore() {
		getDriver().findElement(By.xpath("//a[@id='non-users-notice-link']"));
	}  
     public void verifyApplicationTittle() {
    	   WebDriver  driver = new FirefoxDriver();
    	  
           driver.get("https://www.facebook.com/r.php");
           driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + " n ");
           try {
			Thread.sleep(3000);
			for(String winHandle:driver.getWindowHandles());
			{
				  driver.switchTo().window(winHandle);
			}
			    driver.get("https://www.facebook.com/r.php");
			    
		} catch (Exception e) {
			System.out.println(e);
		}
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
          /* //Actual title:
           String my_title =driver.getTitle();
          System.out.println("Title is "+my_title);
          String expected_title="Facebook page";
          Assert.(my_title,expected_title);
          System.out.println("completed");*/
      }
      
      }
	
      