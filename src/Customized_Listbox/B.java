package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com/");
		//click on create new account btn
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.sendKeys(name,"Puja",Keys.TAB,"misal",Keys.TAB,"advsv@gmail.com",Keys.TAB,"afdgsdsd",Keys.TAB,"afgfdd").perform();
	}
}
