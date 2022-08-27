package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_Element_Screenshot1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//typecast takescreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	WebElement gtitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	//use get Screenshot method
	File src = gtitle.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Trupi\\Desktop\\Puja\\Googleimg.jpg");
	Files.copy(src, dest);
}
}
