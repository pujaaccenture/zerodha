package Cases_of_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains7 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://parabank.parasoft.com/parabank/admin.htm");
		
		//enter the un
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[1]")).click();
		Thread.sleep(2000);
		
		String expT="ParaBank | Accounts Overview";
		String acT=driver.getTitle();
		if(acT.equals(expT)) {
			System.out.println("home page is open ,test case is pass");
		}
		else {
			System.out.println("home page is not open ,test case is fail");
		}
	}

}
