package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException 
    {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_requirement\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //instantiate
	Thread.sleep(4000);
	driver.navigate().to("http://alchemy.hguy.co/crm");
	Thread.sleep(4000);
	
	WebElement img = driver.findElement(By.tagName("a")); 
	String url = img.getAttribute("href");
	
	System.out.println(url);

	driver.quit();
	}

}
