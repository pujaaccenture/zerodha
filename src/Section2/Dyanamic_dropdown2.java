package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dyanamic_dropdown2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	//enter shershaah in google
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Shershaah");
	Thread.sleep(2000);
	
	//inspect the elements
	List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	Thread.sleep(2000);
	
//use for each loop
	for( WebElement oneoption:allelements) {
		String text=oneoption.getText();
		System.out.println(text);
	
	if(text.contains("shershaah movie songs")) {
		oneoption.click();
	break;
	}
	}
}

}
