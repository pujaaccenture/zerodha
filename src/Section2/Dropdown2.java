package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//enter the url
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//enter the username
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	
	//enter the pwd
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	Thread.sleep(2000);

	//click on login button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	
	//click on admin
	driver.findElement(By.xpath("//b[text()='Admin']")).click();
	
	//inspect dropdown
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
	
	Select s=new Select(dropdown);
	Thread.sleep(2000);
	s.selectByIndex(0);
	
	Thread.sleep(2000);
	s.selectByValue("1");
	
	Thread.sleep(2000);
	s.selectByVisibleText("ESS");
}
}
