package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.google.com/");
	//inspect for target elemnt
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	//crete object of actions class
	Actions act=new Actions(driver);
	
	//>>>1 movetoelement
	act.moveToElement(gmail).perform();
	
	//>>>2 right click on target element(contextclick())
	//act.moveToElement(gmail).contextClick().perform();
	
	//>>3 left click/click
	//act.moveToElement(gmail).click().perform();
	
	//>>>4 double click
	//act.moveToElement(gmail).doubleClick().perform();
	//hoe to perform 3 actios in single statement
	act.moveToElement(gmail).contextClick().doubleClick().build().perform();
	
	
}
}
