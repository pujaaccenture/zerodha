package Cases_of_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_attribute2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver,chrome,driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("gdffhg");

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");


driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
Thread.sleep(2000);

String expT="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
String acT=driver.getTitle();
Thread.sleep(2000);

if(acT.equals(expT)) {
	System.out.println("home page is open ,test case is pass");
}
else {
	System.out.println("home page is not open ,test case is fail");
}

}
}
