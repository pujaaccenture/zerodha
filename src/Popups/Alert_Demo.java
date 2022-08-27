package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	//enter customer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	
	///click om submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(3000);
	//switch from from main webpage to popup
	Alert alt = driver.switchTo().alert();
	Thread.sleep(3000);
	
	//click on ok button
	alt.accept();
	//click on cancle button
	//alt.dismiss();
	
	//get the text of popup
	Thread.sleep(3000);
	String text = alt.getText();
	System.out.println(text);
	
}
}
