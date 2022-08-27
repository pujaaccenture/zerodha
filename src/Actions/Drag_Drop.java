package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	//inspect the drag
	WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	//inspect the drop
	WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	//create object of select class
	Actions act=new Actions(driver);
	act.dragAndDrop(ele1, ele2).perform();
}
}
