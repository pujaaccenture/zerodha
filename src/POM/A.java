package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {//how stale element reference exptin generated
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement textfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	textfield.sendKeys("Uri");
	driver.navigate().refresh();
	textfield.sendKeys("Indian");
}
}
