package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_brow1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	//click on cancle button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//search the mobiles
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles",Keys.ENTER);
	//click on `1st mobile so that new child window will opens
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//bydefault control of selenium should be on main webpage we have switch it from main window to child window
	Set<String> allws = driver.getWindowHandles();
	for(String single:allws) {
		driver.switchTo().window(single);//now ur selenium control goes from main window to child win
		
	}
	//get text of child for our confirmation
	String expT = "realme C11 2021 (Cool Grey, 32 GB)  (2 GB RAM)";
	Thread.sleep(2000);
	String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println(actT);
	
	//verify the child window handle or not
	Thread.sleep(2000);
	if(actT.equals(expT)) {
		System.out.println("child window is handle, TC is pass");
	}
	else {
		System.out.println("child windoe is not handle ,TC is fail");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
