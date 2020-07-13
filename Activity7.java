package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args)  throws InterruptedException 
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
	
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();// click login
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@id='grouptab_0']")).click(); // navigate to sales
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#moduleTab_9_Leads")).click(); //  click leads
	Thread.sleep(9000);	
	
	String str = driver.findElement(By.xpath("//a[contains(text(),'Mrs. Ankita Dutta')]")).getText();
	System.out.println(str);  //print the name of my created row
	
	driver.findElement(By.id("adspan_71581148-7c8b-ec07-16b7-5f080aae215e")).click(); // click icon i
	Thread.sleep(3000);
	
	// get mobile no printed on the pop
	
	String text = driver.findElement(By.xpath("//*[@id='ui-id-5']/.//span[contains(@class,'phone')]")).getAttribute("innerHTML");
	System.out.println(text);

	driver.quit();
	}

}
