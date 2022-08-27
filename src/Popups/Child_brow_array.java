package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_brow_array {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//click on cancle button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//secrch for watch
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("washing machine",Keys.ENTER);
	Thread.sleep(3000);
//click on 1st washing machin
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//by default the control of selenim on main window it will switch to child window
	Set<String> allwin = driver.getWindowHandles();
	Thread.sleep(3000);
	//use arraylist to store all windows 
	ArrayList<String> al=new ArrayList<String>(allwin);
	String cw = al.get(1);
	System.out.println(cw);
	//print main window session id
	Thread.sleep(3000);
	String mainwn = al.get(0);
	System.out.println(mainwn);
	//switch to main window
	driver.switchTo().window(al.get(0));
	//for confirmation get title
	String title = driver.getTitle();
	System.out.println(title);
}
}