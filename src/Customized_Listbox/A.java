package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.facebook.com/");
	//click on create new account btn
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//select list of month
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	//create object of actions class
	Actions act=new Actions(driver);
	//click on month
	Thread.sleep(3000);
	act.click(month).perform();
	//move up
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(3000);
	//move down
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(3000);
	//click on topmost element
	act.sendKeys(Keys.HOME).perform();
	//click on elemet
	act.sendKeys(Keys.ENTER).perform();
	
	
}
}
