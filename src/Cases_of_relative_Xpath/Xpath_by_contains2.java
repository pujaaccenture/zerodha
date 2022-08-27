package Cases_of_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	//enter the un
	driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
	Thread.sleep(2000);
	
	//enter the pwd
	driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	//click on login button
driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();	
	Thread.sleep(2000);
	
	String expT="Swag Labs";
	String acT=driver.getTitle(); 
	
	Thread.sleep(2000);
	if(acT.equals(expT)) {
		System.out.println("home page is open,test case is pass");
		
	}
	else {
		System.out.println("home page is not open ,test case is fail");
	}
}
}
