package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver first = new ChromeDriver(); //making webdriver object
		first.get("http://www.bbc.co.uk"); //open URL
		
		WebElement button; //reference for button 
		button = first.findElement(By.linkText("Sport"));
		button.click(); //click the button
	}

}
