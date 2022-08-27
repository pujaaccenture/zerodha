package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon_Screenshot1 {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//typecast takescreenshoy
	TakesScreenshot ts=(TakesScreenshot)driver;
	//use getscreenshot()
	File src = ts.getScreenshotAs(OutputType.FILE);
	//we have to store screenshit at particular destion crete object of file class
	File dest = new File("C:\\Users\\Trupi\\Desktop\\Puja\\amazon.jpg");
	//uhave to trnsfer file source to destination (ya adhi apn filehandlr vapryvho)

	Files.copy(src, dest);
}
}