package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_framework1 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Trupi\\Documents\\May7.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
String un = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
String pwd = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
driver.findElement(By.xpath("//button[text()='Login ']")).click();
//enter pin
String pin = sh.getRow(0).getCell(2).getStringCellValue();
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
driver.findElement(By.xpath("//button[text()='Continue ']")).click();
String expID = sh.getRow(0).getCell(3).getStringCellValue();
 String actID = driver.findElement(By.xpath("//span[text()='DPG458']")).getText();
 if(expID.equals(actID)) {
	 System.out.println("tc pass");
}
 else {
	 System.out.println("tc fail");
 }
 
}
}
