package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_Framework {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	//use implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//enter  user id
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	//enter pwd
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
	//click on login buttton
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	//enter pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
	//click on continue button
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	//verify the id
	String expT="DPG458";
	String actid = driver.findElement(By.xpath("//span[text()='DPG458']")).getText();
	if(expT.equals(actid)) {
		System.out.println("both are same,TC is pass");
	}
	else {
		System.out.println("both are not same ,TC is fail");
	}
}
}
