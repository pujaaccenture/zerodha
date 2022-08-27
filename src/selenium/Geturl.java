package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	 //use getcurrent url
	String link = driver.getCurrentUrl();
	System.out.println(link);
	
	//getTitle
	String title = driver.getTitle();
	System.out.println(title);
}
}
