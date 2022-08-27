package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	
	driver.navigate().to("https://www.amazon.com/");
	
	//backward()
	driver.navigate().back();
	Thread.sleep(3000);
	
	//forward()
	driver.navigate().forward();
	Thread.sleep(3000);
	
	//Refresh()
	driver.navigate().refresh();
	
	//close()
	//driver.close();
	
	//quite()
	driver.quit();
}
}
