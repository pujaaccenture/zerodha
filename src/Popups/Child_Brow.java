package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Brow {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//click on cancle button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//secrch for watch
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("TV",Keys.ENTER);
	Thread.sleep(3000);
	// click click on 1st tv so thatnew child window open
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//by default control of selenium on main webpage it will switch on child wind
	Thread.sleep(3000);
	Set<String> allwin = driver.getWindowHandles();
	for(String singlewin:allwin) {
		driver.switchTo().window(singlewin);
	}
	Thread.sleep(3000);
	String expT = "Adsun 80 cm (32 inch) HD Ready LED Smart Android Based TV  (A-3200S)";
	String actT=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println(actT);
	if(actT.equals(expT)) {
		System.out.println("child windowis open ,TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
}
}
