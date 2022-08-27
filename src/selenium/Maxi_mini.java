package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maxi_mini {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//minimize
	driver.manage().window().minimize();
	
	//note:boss in selenium (version 3 )there is no mimimize()(0 but from selenium version 4)onwards it is implemented
}
}
