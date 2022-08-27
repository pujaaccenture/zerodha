package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//gettitle
	String expt="Google";
	String actT=driver.getTitle();
	
	if(actT.equals(expt)){
		System.out.println("test case is pass expt and actT are matching ");
	}
	else {
		System.out.println("test case is fail expt and actT are  not matching ");
	}
}
}

