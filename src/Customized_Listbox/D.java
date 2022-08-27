package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.facebook.com/");
	//click on create new account btn
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(3000);
	WebElement d = driver.findElement(By.xpath("//select[@id='day']"));
	Select s1=new Select(d);
	s1.selectByVisibleText("10");
	
	Thread.sleep(3000);
	WebElement m = driver.findElement(By.xpath("//select[@id='month']"));
	Select s2=new Select(m);
	s2.selectByVisibleText("Feb");
	Thread.sleep(3000);
	WebElement y= driver.findElement(By.xpath("//select[@id='year']"));
	Select s3=new Select(y);
	s3.selectByVisibleText("1999");
}
}
