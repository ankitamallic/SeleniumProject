package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity9 {

	public static void main(String[] args)throws InterruptedException 
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
	
   // print the first 10 values in the Name column
	
	String beforeXpath = "//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[";
	String afterXpath = "]/td[3]/b/a";
	
	for(int i= 1; i <=10; i++) {
	String actualXpath = beforeXpath+i+afterXpath;
	WebElement element = driver.findElement(By.xpath(actualXpath));
	System.out.println(element.getText());
	}
	
	System.out.println("*********************************************");
	
	 // print the first 10 values in the User column

	String afterXpathUser = "]/td[8]/a";
	for(int i= 1; i <=10; i++) {
	String actualXpath = beforeXpath+i+afterXpathUser;
	WebElement element = driver.findElement(By.xpath(actualXpath));
	System.out.println(element.getText());
	}
	
	driver.quit();

	}

}
