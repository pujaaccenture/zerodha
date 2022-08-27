package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	
	Thread.sleep(2000);
	//switch to frame2
	driver.switchTo().frame("iframeResult");
	
	//enter  first name 
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Puja");
	
	Thread.sleep(2000);
	//enter last name
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Misal");
	
	//click on submit button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
