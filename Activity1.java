package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException 
	    {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_requirement\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //instantiate
		Thread.sleep(4000);
		
		driver.navigate().to("http://alchemy.hguy.co/crm");
		driver.getTitle();
		Thread.sleep(4000);
		
		String at = driver.getTitle();
		String et = "SuiteCRM";
		Thread.sleep(4000);
		
		driver.close();
		if (at.equalsIgnoreCase(et))
		driver.quit();
	
	}

}
