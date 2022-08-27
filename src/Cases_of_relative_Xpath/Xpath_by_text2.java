package Cases_of_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
	//enter the usernam
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	
	Thread.sleep(2000);
	//enter the pwd
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	
	Thread.sleep(2000);
	//click on login button
	driver.findElement(By.xpath("//input[@class='button']")).click();
	
	
}
}
