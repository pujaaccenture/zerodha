package Acttime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//css selector
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	
	String expT="actiTIME - Enter Time-Track";
	Thread.sleep(2000);
	String actT=driver.getTitle();
	Thread.sleep(2000);
	if(actT.equals(expT)) {
		System.out.println("Home page is opened,TC is pass");
	}
	else {
		System.out.println("Home page is not opened,TC is fail");
	}
	
	
}
}
