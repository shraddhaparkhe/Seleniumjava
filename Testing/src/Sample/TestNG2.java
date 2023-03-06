package Sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
public class TestNG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		  WebDriver driver = (WebDriver) new ChromeDriver();
		    driver.get("http://rcpinternal.s3-website-us-west-1.amazonaws.com/setting/manageemailtemplate");
			
	System.out.println("Launched success Rohancards");
	
		}
	

}
