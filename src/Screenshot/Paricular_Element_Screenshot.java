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

public class Paricular_Element_Screenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//i want to take screenshot of particular element for that we have to 1st inspect that elemetnt
	WebElement gtitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	//use typecast Takescreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	//use getscrenshotAs()
	File src = gtitle.getScreenshotAs(OutputType.FILE);
	//store at destination
	File dest = new File("C:\\Users\\Trupi\\Desktop\\Puja\\Googletitle.jpg");
Files.copy(src, dest);
}
}
