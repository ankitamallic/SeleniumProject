package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8 {

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
	
	driver.findElement(By.id("grouptab_0")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//li[2]//span[2]//ul[1]//li[2]//a[1]")).click();
	Thread.sleep(2000);
	
	//*[@id="MassUpdate"]/div[3]/table/tbody/tr[1]/td[3]/b/a
	//*[@id="MassUpdate"]/div[3]/table/tbody/tr[3]/td[3]/b/a
	
	//*[@id="MassUpdate"]/div[3]/table/tbody/tr[9]/td[3]/b/a
	
	String beforeXpath = "//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[";
	String afterXpath = "]/td[3]/b/a";
	
	for(int i= 1; i <=10; i++) {
		if (i % 2 != 0) {
			
	String actualXpath = beforeXpath+i+afterXpath;
	WebElement element = driver.findElement(By.xpath(actualXpath));
	System.out.println(element.getText());
	}
	}
	
	
	driver.quit();
	
	
	}

}
