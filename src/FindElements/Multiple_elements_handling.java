package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_elements_handling {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//click on cancle button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	List<WebElement> elements = driver.findElements(By.xpath("//div"));
	//use for each loop
	for(WebElement ele:elements) {
		String text = ele.getText();
		System.out.println(text);
	}

}
}
