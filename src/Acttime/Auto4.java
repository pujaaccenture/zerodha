package Acttime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.amazon.com/");
	//css selector
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kurti under 1000");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[type='submit']")).click();
}
}
