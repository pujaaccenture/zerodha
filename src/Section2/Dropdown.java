package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//open the Browsers
	driver.get("file:///C:/Users/Trupi/Documents/Punegate.HTML");
	
	//inspect dropdown
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='PuneGate']"));
	
	//create object of select class
	Select s =new Select(dropdown);
	
	//use methods of select class
	s.selectByIndex(3);
	
	//select by value
//	s.selectByValue("d");
	
	//select by visible text
	//s.selectByVisibleText("Pizza");
	
	
	
}
}
