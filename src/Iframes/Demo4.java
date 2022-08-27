package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
     //maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//swict on 1st frame
	driver.switchTo().frame("packageListFrame");
	Thread.sleep(2000);
	
	String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.devtools']")).getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	//switch on 2nd frame
	driver.switchTo().defaultContent();
	Thread.sleep(2000);

	driver.switchTo().frame("packageFrame");
	String text1 = driver.findElement(By.xpath("//a[text()='Actions']")).getText();
	System.out.println(text1);
	
	
	//switch on 3rd frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	Thread.sleep(2000);
	
	String text2 = driver.findElement(By.xpath("//div[text()='Indicates that a driver supports authenticating to a website in some way.']")).getText();
System.out.println(text2);
}
}