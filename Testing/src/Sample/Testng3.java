package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
public class Testng3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\\\ChromeDriver.exe");
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("http://www.firstcry.com");
		    System.out.println("Launched success");
			}

		}
	