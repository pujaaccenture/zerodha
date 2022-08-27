package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Trupi/Downloads/WebTable%20by%20ANKUSH%20(1).html");
	
	//print student name
	String name = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	System.out.println(name);
	Thread.sleep(3000);
	
	//print sachin
	String sn = driver.findElement(By.xpath("(//table[@id='2244']//td)[2]")).getText();
	System.out.println(sn);
	Thread.sleep(3000);
	
	//shipla
	String sh = driver.findElement(By.xpath("(//table[@id='2244']//td)[11]")).getText();
	System.out.println(sh);
}
}
