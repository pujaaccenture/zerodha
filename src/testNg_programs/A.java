package testNg_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	@Test
public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
