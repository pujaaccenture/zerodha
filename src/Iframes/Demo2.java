package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");

		//maximize the browser
		driver.manage().window().maximize();
		
	//	switch 1st frame
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
		
		//take 1st element on 1st frame
		String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi']")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		//switch 2nd frame
		driver.switchTo().defaultContent();//it will move control of seleniun from 1st frame to main webpage
		driver.switchTo().frame("packageFrame");

	Thread.sleep(3000);
//take 1st element on 2nd frame
		String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		System.out.println(text1);
		
		//switch 3rd frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);
		
		//take 1st element on 3rd frame
		String text2 = driver.findElement(By.xpath("//a[text()='By.Remotable']")).getText();
		System.out.println(text2);
	}
}
		
		
		
		