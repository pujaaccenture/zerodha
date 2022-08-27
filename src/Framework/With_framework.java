package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_framework {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Trupi\\Documents\\May7.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//enter the url
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	//enter user id
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	//enter pwd
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	//click on continue 
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	//enter pin
	 String PIN = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
	//click on continue
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	String actID = driver.findElement(By.xpath("//span[text()='DPG458']")).getText();
	String expID = sh.getRow(0).getCell(3).getStringCellValue();
	if(actID.equals(expID)) {
		System.out.println("Test case pass");
	}
	else {
		System.out.println("Test case fail");
		
	}
}


}
