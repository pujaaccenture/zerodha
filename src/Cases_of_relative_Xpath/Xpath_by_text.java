package Cases_of_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//enter the url
	driver.get("https://demo.actitime.com/login.do");
	
	//enter the un
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	//enter the pwd
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	
	//click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(2000);
	
	String expT="actiTIME - Enter Time-Track";
 String acT = driver.getTitle();
	Thread.sleep(2000);
	
	if(acT.equals(expT)) {
		System.out.println("home page is open ,test case is pass");
	}
	
	else {
		System.out.println("home page is not open,test case is fail");
	}
	
	
}
}
