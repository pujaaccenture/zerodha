package Cases_of_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_group_index7 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://parabank.parasoft.com/parabank/admin.htm");

		//enter the username
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("admin");
		Thread.sleep(2000);
		
		//enter the pwd
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("admin");
		
		//click on login button
		driver.findElement(By.xpath("(//input)[3]")).click();
		Thread.sleep(2000);
		
		String expT="ParaBank | Accounts Overview";
		String acT=driver.getTitle();
		Thread.sleep(2000);
		
		if(acT.equals(expT)) {
			System.out.println("home page is open ,test case is pass");
		}
		else {
			System.out.println("home page is not open ,,test case is fail");
		}
	}
}
