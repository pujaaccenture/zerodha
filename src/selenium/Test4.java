package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.close();
	
}
}
