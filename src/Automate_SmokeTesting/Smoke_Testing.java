package Automate_SmokeTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smoke_Testing {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//login page
	String expT="actiTIME - Login";
	driver.get("https://demo.actitime.com/login.do");
	String acT=driver.getTitle();
	if(expT.equals(acT)) {
		System.out.println("Test step is pass");
	}
	else {
		System.out.println("Test step is fail");
	}
	//home page
	Thread.sleep(3000);
	//enter username
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//enter pwd
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	Thread.sleep(3000);
	String expTH="actiTIME - Enter Time-Track";
	String acTH=driver.getTitle();
	if(expTH.equals(acTH)) {
		System.out.println("Test step is pass");
	}
	else {
		System.out.println("Test step is fail");
	}
	//create user
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("radha");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).clear();
}
}
