package Dyanamic_Elements_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Virus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
	String c = driver.findElement(By.xpath("(//div[@id='maincounter-wrap']//span)[1]")).getText();
	System.out.println(c);
}
}
