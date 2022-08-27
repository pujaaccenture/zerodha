package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_dropdown4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("vivah");
 List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
 Thread.sleep(3000);
for(WebElement oneoption:alloptions) {
	String text = oneoption.getText();
	System.out.println(text);
	
}
}
}