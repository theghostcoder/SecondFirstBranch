package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Banking {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stu
	
		System.setProperty("webdriver.gecko.driver","C:/workspace/geckodriver-v0.12.0-win64/geckodriver.exe");
			
		WebDriver travel = new FirefoxDriver();			
		//Launch the Web site
		travel.get("http://phptravels.com/demo/");
		
		//Print a message on console
		System.out.println("Application title is ============="+travel.getTitle());
		      
        //wait for 5 sec
    Thread.sleep(5);
    
    travel.findElement(By.className("btn btn-primary btn-lg btn-block").)
    
    
    
	}

}
