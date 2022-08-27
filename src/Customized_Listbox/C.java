package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup//");
	Thread.sleep(3000);
	WebElement a = driver.findElement(By.xpath("//span[text()='About Me']"));
	Thread.sleep(3000);
	WebElement b = driver.findElement(By.xpath("((//ul[@class='sub-menu'])[3]//span)[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(a).perform();
	act.moveToElement(b).click().perform();
}
}
