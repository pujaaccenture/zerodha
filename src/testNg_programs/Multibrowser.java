package testNg_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {
	@Parameters("browsername")//annotation
	@Test
public void TC1( String browsername) {//paramerised method
	WebDriver driver=null;//runtime polymorphism
	if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Trupi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
	else if(browsername.equals("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Trupi\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	driver=new EdgeDriver();
			}
	driver.get("https://kite.zerodha.com/");
}
}
