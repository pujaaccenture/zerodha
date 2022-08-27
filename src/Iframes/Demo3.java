package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
//maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//switch 1st frame
	driver.switchTo().frame("packageListFrame");
	//element on 1st frame
	String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	
	//switch 2nd frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	//element on 2nd frame
	String text1 = driver.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText();
	System.out.println(text1);
	Thread.sleep(3000);
	
	//switch 3rd frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	//element on 3rd frame
	String text2 = driver.findElement(By.xpath("//a[text()='Capabilities']")).getText();
	System.out.println(text2);
}
}
