package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException 
    {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_requirement\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //instantiate
	Thread.sleep(4000);
	driver.navigate().to("http://alchemy.hguy.co/crm");
	Thread.sleep(4000);
	
	WebElement str = driver.findElement(By.xpath("//*[@id='admin_options']"));
	String text = str.getText();
	System.out.println(text);
	
	driver.quit();
	

	}

}
