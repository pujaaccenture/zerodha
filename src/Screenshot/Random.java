package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Random {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	//use RandomString class 
String random =RandomString.make();
//typecast TakesScreenshot interface
TakesScreenshot ts = (TakesScreenshot)driver;
//use getscreenshotAs
  File src = ts.getScreenshotAs(OutputType.FILE);
  //we have to store screenshit at particular dwstinTION create object of file class
File dest=new File("C:\\Users\\Trupi\\Desktop\\Puja\\"+random+".jpg");
//u have to transfer file source to destination(ya adhi amhi findhandler vapraycho)
Files.copy(src, dest);
}
}
