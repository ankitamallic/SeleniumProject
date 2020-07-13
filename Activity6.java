package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException 
    {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_requirement\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //instantiate
	Thread.sleep(4000);
	driver.navigate().to("http://alchemy.hguy.co/crm");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
	Thread.sleep(3000);
	
	String text = driver.findElement(By.cssSelector("#grouptab_3")).getText();
	System.out.println("the tab name is " +text );
	
	Assert.assertEquals(text, "ACTIVITIES");
	
	driver.quit();
		
	}

}
