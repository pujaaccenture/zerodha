package testNg_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowse1 {
	@Parameters("browsername")
	@Test
public void TC1( String browsername) {
	WebDriver driver=null;
	if(browsername.equals("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
driver=new ChromeDriver();
}
	else if(browsername.equals("Firefox")) {
System.setProperty("webdriver.gecko.driver","C:\\Users\\Trupi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get("https://kite.zerodha.com/");
	}
}