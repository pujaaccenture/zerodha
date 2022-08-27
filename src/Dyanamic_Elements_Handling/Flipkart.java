package Dyanamic_Elements_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.flipkart.com/");
		//click on cancle button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//search for mobile
		Thread.sleep(3000);
driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles under 20000",Keys.ENTER);
Thread.sleep(3000);
//navigate to dyanamic elements (make sure that u r taking class)
String rating = driver.findElement(By.xpath("(//div[@class='gUuXy-']//span)[4]")).getText();
System.out.println(rating);


Thread.sleep(3000);
//using desendant 
String review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']/descendant::span)[4]")).getText();
System.out.println(review);
	}

}
