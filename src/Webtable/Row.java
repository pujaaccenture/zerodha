package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Row {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Trupi/Downloads/WebTable%20by%20ANKUSH%20(1).html");
	//print single row
	String row = driver.findElement(By.xpath("//table[@id='2244']//tr[1]")).getText();
	System.out.println(row);
	
	Thread.sleep(3000);
String row1 = driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
System.out.println(row1);
}
}
