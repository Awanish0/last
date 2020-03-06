package Testing;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	  public ChromeDriver driver;
		
	  
	    public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("Awanish");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("123456");
		WebElement forgt=driver.findElementByLinkText("Forgotten account?");
		forgt.click();
		WebElement account=driver.findElement(By.id("identify_email"));
		account.sendKeys("0971654221");
		WebElement serach=driver.findElement(By.name("did_submit"));
		serach.click();
	    
		
	     }
	    }
		
		    /*driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());*/
	     
	   
	       
