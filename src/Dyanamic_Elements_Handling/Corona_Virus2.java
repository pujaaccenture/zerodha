package Dyanamic_Elements_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Virus2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
	String recover = driver.findElement(By.xpath("(//div[@id='maincounter-wrap']//span)[3]")).getText();
	System.out.println(recover);
}
}
