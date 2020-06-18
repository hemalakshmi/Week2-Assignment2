package Week.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[1]").click();;
		driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[4]").click();;
		
		//Confirm Selenium is checked
		boolean confrmSele = driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[6]").isSelected();
		System.out.println("Selenium is selected: " + confrmSele);
		
		//DeSelect only checked
		boolean deSelect = driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[8]").isSelected();
		if(deSelect==true) {
			driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[8]").click();
			System.out.println("Checkbox Deselected: " + deSelect);
		}
		
		
		//Select all below checkboxes
		driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[9]").click();
		driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[10]").click();
		driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[11]").click();
		driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[12]").click();
		driver.findElementByXPath("(//label[text()='Select the languages that you know?'])/following::input[13]").click();
		System.out.println("All checkboxes are selected");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.close();
	}

}
