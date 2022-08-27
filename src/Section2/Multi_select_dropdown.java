package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_select_dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//open the application
	driver.get("file:///C:/Users/Trupi/Documents/paradise.html");
	
	//inspect the dropdown
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='Paradise']"));

	//crete object of select class
	Select s= new Select(dropdown);
	
	//check whether DD is multiselectable or not
	if(s.isMultiple()) {
		System.out.println("Given DD is multiselectable");
	}
	else {
		System.out.println("Given DD is not multiselectable");
	}
	
	//get size of all options
	List<WebElement> allelements = s.getOptions();
	System.out.println(allelements.size());
	
	//get the text of all elements 
	for(int i=0;i<=allelements.size()-1;i++) {
		WebElement oneelement = allelements.get(i);
		String text=oneelement.getText();
		System.out.println(text);
	}		
	}
}
		
		
		
		
		
		
	




