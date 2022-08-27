package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		//maximize the browser
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//minimize the browser
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		driver.close();
	}

}
