package FindElements;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_links {
public static void main(String[]args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Trupi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	
}
}