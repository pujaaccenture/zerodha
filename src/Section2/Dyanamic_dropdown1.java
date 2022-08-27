package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_dropdown1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	
	//enter the kurti in amazon
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kurti");
	Thread.sleep(3000);

	//inspect elements
	List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	
	//use for each loop
	for(WebElement oneoption:alloptions) {
		String  text=oneoption.getText();
		System.out.println(text);
		
		if(text.contains("kurti set")){
			oneoption.click();
			break;
		}
		
		
		
		
		
	}
}
}
