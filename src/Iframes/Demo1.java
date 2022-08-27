package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");

	//maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//switch to 1st frame
driver.switchTo().frame("packageListFrame");

//take 1st element on 1st frame 
String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
System.out.println(text);
Thread.sleep(2000);

//switch to 2nd frame
driver.switchTo().defaultContent();//it will move control of selenium from 1st frame to main webpage
Thread.sleep(2000);

driver.switchTo().frame("packageFrame");
Thread.sleep(2000);

//take 1st element on 2nd frame
String text1 = driver.findElement(By.xpath("//a[text()='AbstractHttpCommandCodec']")).getText();
System.out.println(text1);
Thread.sleep(2000);

//switch to 3rd frame
driver.switchTo().defaultContent();
Thread.sleep(2000);

driver.switchTo().frame("classFrame");
Thread.sleep(2000);

//take 1st element 3 rd frame
String text2 = driver.findElement(By.xpath("//th[text()='Interface']")).getText();
System.out.println(text2);






}
}
